package com.amr.project.service.abstracts;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.CartItemDTO;

import java.util.List;

public interface CartItemService {

    List<CartItemDTO> getAllCartItems();

    CartItemDTO getCartItemsById(Long id);

    void saveCartItem(CartItemDTO cartItemDTO);

    void updateCartItem(CartItemDTO cartItemDTO);

    void deleteCartItem(Long id);
}
