package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.entity.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartItemMapperImpl implements CartItemMapper {

    private final CartItemMapper cartItemMapper;

    @Autowired
    public CartItemMapperImpl(CartItemMapper cartItemMapper) {
        this.cartItemMapper = cartItemMapper;
    }


    @Override
    public CartItemDTO toDTO(CartItem cartItem) {
        return cartItemMapper.toDTO(cartItem);
    }

    @Override
    public CartItem toEntity(CartItemDTO cartItemDto) {
        return cartItemMapper.toEntity(cartItemDto);
    }

    @Override
    public List<CartItemDTO> toDTOList(List<CartItem> cartItems) {
        if (cartItems == null) return null;
        List<CartItemDTO> list = new ArrayList<>(cartItems.size());
        for (CartItem cartItem : cartItems) {
            list.add(cartItemMapper.toDTO(cartItem));
        }
        return list;
    }

    @Override
    public List<CartItem> toEntityList(List<CartItemDTO> cartItemDTOS) {
        if (cartItemDTOS == null) return null;
        List<CartItem> list = new ArrayList<>(cartItemDTOS.size());
        for (CartItemDTO cartItemDTO : cartItemDTOS) {
            list.add(cartItemMapper.toEntity(cartItemDTO));
        }
        return list;
    }
}
