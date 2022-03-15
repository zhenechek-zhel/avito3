package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, OrderMapper.class,
        ShopMapper.class, FavoriteMapper.class, ImageMapper.class, ReviewMapper.class, CartItemMapper.class})
public interface ItemMapper {

    ItemDTO toDTO(Item item);

    Item toEntity(ItemDTO itemDTO);

    List<ItemDTO> toDTOList(List<Item> items);

    List<Item> toEntityList(List<ItemDTO> itemDTOS);
}
