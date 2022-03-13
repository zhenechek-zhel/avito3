package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface ItemSetMapper {

    ItemSetMapper INSTANCE = Mappers.getMapper(ItemSetMapper.class);

    Set<ItemDTO> toDTOSet(Set<Item> items);

    Set<Item> toEntitySet(Set<ItemDTO> itemDTOS);
}
