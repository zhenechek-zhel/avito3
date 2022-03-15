package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ShopMapper.class, ItemMapper.class})
public interface CartItemMapper {

    CartItemDTO toDTO(CartItem cartItem);

    CartItem toEntity(CartItemDTO cartItemDto);

    List<CartItemDTO> toDTOList(List<CartItem> cartItems);

    List<CartItem> toEntityList(List<CartItemDTO> cartItemDTOS);
}
