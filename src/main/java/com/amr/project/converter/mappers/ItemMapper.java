package com.amr.project.converter.mappers;

import com.amr.project.converter.lists.OrderListMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CategoryMapper.class, OrderListMapper.class, CartItemMapper.class, ImageMapper.class, ReviewMapper.class, FavoriteMapper.class})
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    ItemDTO toDTO(Item item);

    Item toEntity(ItemDTO itemDTO);
}
