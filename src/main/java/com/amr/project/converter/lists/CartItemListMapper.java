package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.CartItemMapper;
import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = CartItemMapper.class)
public interface CartItemListMapper {

    CartItemListMapper INSTANCE = Mappers.getMapper(CartItemListMapper.class);

    List<CartItemDTO> toDTOList(List<CartItem> cartItems);

    List<CartItem> toEntityList(List<CartItemDTO> cartItemDTOList);
}
