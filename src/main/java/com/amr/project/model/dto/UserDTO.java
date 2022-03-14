package com.amr.project.model.dto;

import com.amr.project.model.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String email;
    private String username;
    private String password;
    private boolean activate;
    private String activationCode;
    private boolean isUsingTwoFactorAuth;
    private String secret;
    private RolesDTO role;
    private UserInfoDTO userInfo;
    private FavoriteDTO favorite;
    private AddressDTO address;
    private List<ImageDTO> images;

    private List<CouponDTO> coupons;
    private List<CartItemDTO> cart;
    private List<OrderDTO> orders;
    private List<ReviewDTO> reviews;
    private List<ShopDTO> shops;
    private List<DiscountDTO> discounts;
    private List<MessageDTO> messages;
    private List<ChatDTO> chats;
    private List<FeedbackDTO> feedbacks;

}
