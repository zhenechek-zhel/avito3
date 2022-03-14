package com.amr.project.webapp.controller;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ItemService;
import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ItemController {

    //TODO в гет отдавать лист или сет?

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public ResponseEntity<Set<ItemDTO>> getAllItems() {
        List<Item> items = itemService.getAllItems();

        Set<ItemDTO> itemDTOS = items.stream()
                .map(i -> ItemMapper.INSTANCE.toDTO(i))
                .collect(Collectors.toSet());

        return new ResponseEntity<>(itemDTOS, HttpStatus.OK);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<ItemDTO> getItem(@PathVariable(name = "id") Long id) {
        ItemDTO itemDTO = ItemMapper.INSTANCE.toDTO(itemService.getItemById(id));
        return new ResponseEntity<>(itemDTO, HttpStatus.OK);
    }

    @PostMapping("/items")
    public ResponseEntity<ItemDTO> addItem(@RequestBody ItemDTO itemDTO) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDTO);
        itemService.saveItem(item);
        ItemDTO dto = ItemMapper.INSTANCE.toDTO(item);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PatchMapping("/items/{id}")
    public ResponseEntity<ItemDTO> editItem(
            @PathVariable(name = "id") Long id,
            @RequestBody ItemDTO itemDTO) {
        Item item = ItemMapper.INSTANCE.toEntity(itemDTO);
        itemService.updateItem(item);
        ItemDTO dto = ItemMapper.INSTANCE.toDTO(item);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/items/{id}")
    public ResponseEntity<Long> deleteItem(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
