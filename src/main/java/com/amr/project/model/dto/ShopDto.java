package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDto {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    private int count;

    private double rating;
    private Country location;
    private Set<ItemDTO> items;
    private Set<ReviewDto> reviews;
    private ImageDto logo;
    private UserDto user;
    private CartItemDto cartItem;
    private Set<FeedbackDto> feedbacks;
    private Set<DiscountDto> discounts;
    private Set<FavoriteDto> favorites;
    private AddressDto address;
    private Set<CouponDto> coupons;

}
