package com.amr.project.converter;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDTO toItemDTO(Item item);
    Item toItem(ItemDTO itemDTO);
}
