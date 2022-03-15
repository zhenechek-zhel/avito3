package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemMapperImpl implements ItemMapper {

    private final ItemMapper itemMapper;

    @Autowired
    public ItemMapperImpl(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

    @Override
    public ItemDTO toDTO(Item item) {
        return itemMapper.toDTO(item);
    }

    @Override
    public Item toEntity(ItemDTO itemDTO) {
        return itemMapper.toEntity(itemDTO);
    }

    @Override
    public List<ItemDTO> toDTOList(List<Item> items) {
        if (items == null) return null;
        List<ItemDTO> list = new ArrayList<>(items.size());
        for (Item item : items) {
            list.add(itemMapper.toDTO(item));
        }
        return list;
    }

    @Override
    public List<Item> toEntityList(List<ItemDTO> itemDTOS) {
        if (itemDTOS == null) return null;
        List<Item> list = new ArrayList<>(itemDTOS.size());
        for (ItemDTO itemDTO : itemDTOS) {
            list.add(itemMapper.toEntity(itemDTO));
        }
        return list;
    }
}
