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
    private FavoriteDTO favorite;
    private AddressDTO address;
    private Set<ImageDTO> images;

    private Set<CouponDTO> coupons;
    private Set<CartItemDTO> cart;
    private Set<OrderDTO> orders;
    private Set<ReviewDTO> reviews;
    private Set<ShopDTO> shops;
    private Set<DiscountDTO> discounts;
    private Set<MessageDTO> messages;
    private Set<ChatDTO> chats;
    private Set<FeedbackDTO> feedbacks;
}
