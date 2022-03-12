package com.amr.project.model.dto;

import com.amr.project.model.enums.Roles;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    //TODO переносить методы из UserDetails?

    private Long id;
    private String email;
    private String username;
    private String password;
    private boolean activate;
    private String activationCode;
    private boolean isUsingTwoFactorAuth;
    private String secret;
    private Roles role;
    private UserInfoDTO userInfo;
    private FavoriteDto favorite;
    private AddressDto address;
    private Set<ImageDto> images;

    private Set<CouponDto> coupons;
    private Set<CartItemDto> cart;
    private Set<OrderDto> orders;
    private Set<ReviewDTO> reviews;
    private Set<ShopDTO> shops;
    private Set<DiscountDto> discounts;
    private Set<MessageDto> messages;
    private Set<ChatDto> chats;
    private Set<FeedbackDto> feedbacks;
}
