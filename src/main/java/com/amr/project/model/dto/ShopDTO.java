package com.amr.project.model.dto;

import com.amr.project.model.entity.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private List<ItemDTO> items;
    private List<ReviewDTO> reviews;
    private ImageDTO logo;
    private UserDTO user;
    private CartItemDTO cartItem;
    private List<FeedbackDTO> feedbacks;
    private List<DiscountDTO> discounts;
    private List<FavoriteDTO> favorites;
    private AddressDTO address;
    private List<CouponDTO> coupons;

}
