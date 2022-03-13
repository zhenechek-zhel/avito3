package com.amr.project.service.impl;

import com.amr.project.converter.ItemMapper;
import com.amr.project.dao.abstracts.ItemRepository;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.getById(id);
    }

    @Override
    public void saveItem(Item item) {
        itemRepository.saveAndFlush(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.saveAndFlush(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }


}
