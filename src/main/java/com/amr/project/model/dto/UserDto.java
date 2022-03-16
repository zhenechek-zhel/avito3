package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String email;
    private String username;
    private String password;
    private boolean activate;
    private String activationCode;
    private boolean isUsingTwoFactorAuth;
    private String secret;
    private RolesDto role;
    private UserInfoDto userInfo;
    private FavoriteDto favorite;
    private AddressDto address;
    private List<ImageDto> images;

    private List<CouponDto> coupons;
    private List<CartItemDto> cart;
    private List<OrderDto> orders;
    private List<ReviewDto> reviews;
    private List<ShopDto> shops;
    private List<DiscountDto> discounts;
    private List<MessageDto> messages;
    private List<ChatDto> chats;
    private List<FeedbackDto> feedbacks;

}
