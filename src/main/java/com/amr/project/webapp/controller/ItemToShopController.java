package com.amr.project.webapp.controller;

import com.amr.project.converter.ItemMapper;
import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.model.dto.ItemDTO;

import com.amr.project.model.entity.Item;

import com.amr.project.service.abstracts.ItemService;
import com.amr.project.service.abstracts.ShopService;
import com.paypal.api.payments.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ItemToShopController {


    private ItemService itemService;
    private ShopService shopService;

    @Autowired
    public ItemToShopController(ItemService itemService, ShopService shopService) {
        this.itemService = itemService;
        this.shopService = shopService;
    }

    @GetMapping("/shop/{idShop}/items")
    public ResponseEntity<Set<ItemDTO>> getAllItemsInShop( @PathVariable(name = "idShop") Long idShop) {
        return new ResponseEntity<Set<ItemDTO>>(ItemSetMapper.INSTANCE
                .toDTOSet(shopService.getShopById(idShop).getItems()), HttpStatus.OK);
    }

    @GetMapping("/shop/{idShop}/items/{idItem}")
        public ResponseEntity<ItemDTO> getItemInShop( @PathVariable(name = "idShop") Long idShop,
                                                @PathVariable(name = "idItem") Long idItem) {
        if (shopService.getShopById(idShop).getItems().contains(itemService.getItemById(idItem))) {
            return new ResponseEntity<ItemDTO>(ItemMapper.INSTANCE
                    .toDTO(itemService.getItemById(idItem)),HttpStatus.OK) ;
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    @PostMapping("/shop/{idShop}/items")
    public ResponseEntity<Set<Item>> addItemInShop( @PathVariable(name = "idShop") Long idShop,
                                                    @RequestBody ItemDTO itemDtoToAdd) {
        Item item = ;
        Set<Item> items = shopService.getShopById(idShop).getItems();
        if (!items.contains(item)) {
            items.add(itemService.getItemById(item.getId()));
        }
        items.stream()
                .map(ItemMapper.INSTANCE::toItemDTO)
                .collect(Collectors.toSet());

        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @DeleteMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<HttpStatus> deleteItemFromShop(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToDelete) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDtoToDelete); // полученный JSON преобразуем в Entity
        Set<Item> items = shopService.getShopById(idShop).getItems(); // вытаскиваем коллекцию всех предметов, которые находятся в магазине
        if (items.contains(item)) {
            items.remove(itemService.getItemById(idItem));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PatchMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<Set<Item>> editItem(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToUpdate) {

        Item item = ItemMapper.INSTANCE.toItem(itemDtoToUpdate);
        Set<Item> items = shopService.getShopById(idShop).getItems();

        items.stream()
                .filter(item1 -> item1.getId().equals(item.getId()))
                .findFirst()
                .ifPresent(i -> itemService.updateItem(i));

        items.stream()
                .map(ItemMapper.INSTANCE::toItemDTO)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
}
