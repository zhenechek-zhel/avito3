package com.amr.project.converter.sets;


import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CartItemSetMapper.class)
public interface CartItemSetMapper {

    Set<CartItemDTO> toDTOSet(Set<CartItem> cartItems);
    Set<CartItem> toEntitySet(Set<CartItemDTO> cartItemDTOSet);
}
