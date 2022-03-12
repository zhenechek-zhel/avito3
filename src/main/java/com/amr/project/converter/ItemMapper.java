package com.amr.project.converter;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;




@Mapper
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    ItemDTO toItemDTO(Item item);

    Item toItem(ItemDTO itemDTO);
}
