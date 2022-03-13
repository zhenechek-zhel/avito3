package com.amr.project.webapp.controller;

import com.amr.project.converter.ItemMapper;
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
    private final ItemMapper itemMapper;


    @Autowired
    public ItemToShopController(ItemService itemService, ShopService shopService, ItemMapper itemMapper) {
        this.itemService = itemService;
        this.shopService = shopService;
        this.itemMapper = itemMapper;
    }

    @PutMapping("/shop/{idShop}/items/{idItem}")
    public ResponseEntity<Set<Item>> addItemInShop(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
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
    public ResponseEntity<Set<Item>> deleteItemFromShop(
            @PathVariable(name = "idItem") Long idItem,
            @PathVariable(name = "idShop") Long idShop,
            @RequestBody ItemDTO itemDtoToDelete) {

        Item item = ItemMapper.INSTANCE.toItem(itemDtoToDelete);
        Set<Item> items = shopService.getShopById(idShop).getItems();

        if (items.contains(item)) {
            items.remove(itemService.getItemById(item.getId()));
        }
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
