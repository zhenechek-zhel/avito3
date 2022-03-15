package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CartItemDto;

import java.util.List;

public interface CartItemService {

    List<CartItemDto> getAllCartItems();

    CartItemDto getCartItemsById(Long id);

    void saveCartItem(CartItemDto cartItemDTO);

    void updateCartItem(CartItemDto cartItemDTO);

    void deleteCartItem(Long id);
}
