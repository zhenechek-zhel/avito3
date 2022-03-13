package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    private int count;

    private double rating;
    private Country location;
    private Set<ItemDTO> items;
    private Set<ReviewDTO> reviews;
    private ImageDTO logo;
    private UserDTO user;
    private CartItemDTO cartItem;
    private Set<FeedbackDTO> feedbacks;
    private Set<DiscountDTO> discounts;
    private Set<FavoriteDTO> favorites;
    private AddressDTO address;
    private Set<CouponDTO> coupons;

}
