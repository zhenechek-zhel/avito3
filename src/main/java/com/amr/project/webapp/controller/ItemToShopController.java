package com.amr.project.webapp.controller;

import com.amr.project.converter.ItemMapper;
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


    @PostMapping("/shop/{idShop}/items")
    public ResponseEntity<HttpStatus> addItemInShop(
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToAdd) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDtoToAdd);

        Set<Item> items = shopService.getShopById(idShop).getItems();

        if (!items.contains(item)) {
            items.add(itemService.getItemById(item.getId()));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }



    @DeleteMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<HttpStatus> deleteItemFromShop(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToDelete) {

        Item item = ItemMapper.INSTANCE.toEntity(itemDtoToDelete);
        Set<Item> items = shopService.getShopById(idShop).getItems();

        if (!items.contains(item)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        items.remove(itemService.getItemById(idItem));
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

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
