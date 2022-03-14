package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = ItemMapper.class)
public interface ItemListMapper {

    ItemListMapper INSTANCE = Mappers.getMapper(ItemListMapper.class);

    List<ItemDTO> toDTOList(List<Item> items);

    List<Item> toEntityList(List<ItemDTO> itemDTOS);
}
