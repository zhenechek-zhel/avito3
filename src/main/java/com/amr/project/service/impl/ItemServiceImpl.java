package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.dao.abstracts.ItemRepository;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;


    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return itemMapper.toDTOList(items);
    }

    @Override
    public ItemDTO getItemById(Long id) {
         Item item = itemRepository.getById(id);
        return itemMapper.toDTO(item);
    }

    @Override
    public void saveItem(ItemDTO item) {
       Item item = itemRepository.saveAndFlush(item);
       return itemMapper.toDTO(itemRepository.saveAndFlush(item));
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
