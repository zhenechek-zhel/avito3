package com.amr.project.converter;

import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartItemDTO toCartItemDTO(CartItem cartItem);
    CartItem toCartItem(CartItemDTO cartItemDto);
}
