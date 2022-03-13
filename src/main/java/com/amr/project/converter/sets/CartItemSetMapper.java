package com.amr.project.converter.sets;

import com.amr.project.converter.CartItemMapper;
import com.amr.project.converter.ItemMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.Address;
import com.amr.project.model.entity.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CartItemMapper.class)
public interface CartItemSetMapper {

    CartItemSetMapper INSTANCE = Mappers.getMapper(CartItemSetMapper.class);

    Set<CartItemDTO> toDTOSet(Set<CartItem> cartItems);
    Set<CartItem> toEntitySet(Set<CartItemDTO> cartItemDTOSet);
}
