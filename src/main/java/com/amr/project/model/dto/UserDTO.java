package com.amr.project.model.dto;

import com.amr.project.model.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements UserDetails {

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


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }
}
