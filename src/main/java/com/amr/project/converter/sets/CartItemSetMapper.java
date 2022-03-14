package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.CartItemMapper;
import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = CartItemMapper.class)
public interface CartItemSetMapper {

    CartItemSetMapper INSTANCE = Mappers.getMapper(CartItemSetMapper.class);

    Set<CartItemDTO> toDTOSet(Set<CartItem> cartItems);

    Set<CartItem> toEntitySet(Set<CartItemDTO> cartItemDTOSet);
}
