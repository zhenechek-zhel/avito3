package com.amr.project.webapp.controller;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.model.dto.ItemDTO;

import com.amr.project.model.entity.Item;

import com.amr.project.service.abstracts.ItemService;
import com.amr.project.service.abstracts.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ItemToShopController {

    //TODO подумать над методом удаления, нужен ли RequestBody, Обсудить delete

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
    public ResponseEntity<HttpStatus> addItemInShop(
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToAdd) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDtoToAdd);
        Set<Item> items = shopService.getShopById(idShop).getItems();
        if (!items.contains(item)) {
            items.add(itemService.getItemById(item.getId()));
            ItemSetMapper.INSTANCE.toDTOSet(items);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<HttpStatus> deleteItemFromShop(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop) {

        Item item = itemService.getItemById(idItem);
        Set<Item> items = shopService.getShopById(idShop).getItems();
        if (!items.contains(item)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        items.remove(item);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<HttpStatus> editItem(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToUpdate) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDtoToUpdate);
        Set<Item> items = shopService.getShopById(idShop).getItems();
        if (!items.contains(item)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        items.stream()
                .filter(item1 -> item1.getId().equals(idItem))
                .findFirst()
                .ifPresent(i -> itemService.updateItem(i));
        ItemSetMapper.INSTANCE.toDTOSet(items);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
