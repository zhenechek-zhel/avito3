package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.dao.ItemRepository;
import com.amr.project.model.dto.ItemDto;
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
    public List<ItemDto> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return itemMapper.toDtoList(items);
    }

    @Override
    public ItemDto getItemById(Long id) {
        Item item = itemRepository.getById(id);
        return itemMapper.toDto(item);
    }

    @Override
    public void saveItem(ItemDto itemDTO) {
       Item item = itemMapper.toEntity(itemDTO);
       itemRepository.saveAndFlush(item);
    }

    @Override
    public void updateItem(ItemDto itemDTO) {
        Item item = itemMapper.toEntity(itemDTO);
        itemRepository.saveAndFlush(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> findFirst4ByOrderByRatingAsc() {
        return itemRepository.findFirst4ByOrderByRatingAsc();
    }


}
