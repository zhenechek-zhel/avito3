package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.*;
import javax.xml.stream.Location;
import java.util.Set;


@Getter
@Setter
@ToString
public class ShopDto {

    @JsonProperty(required = true)
    @NotBlank
    @NotEmpty
    private String name;

    @JsonProperty(required = true)
//    @Email(message = "Email should be valid")
    private String email;

    @JsonProperty(required = true)
//    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phone;

    @JsonProperty(required = true)
    @NotEmpty
    @NotBlank
    private String description;

    private int count;

    private double rating;

    private CountryDto location;

    @JsonIgnore
    private Set<ItemDto> items;

    @JsonIgnore
    private Set<ReviewDto> reviews;

    @JsonIgnore
    private ImageDto logo;

    @JsonIgnore
    private UserDto user;

    @JsonIgnore
    private CartItemDto cartItem;

    @JsonIgnore
    private Set<FeedbackDto> feedback;

    @JsonIgnore
    private Set<DiscountDto> discounts;

    @JsonIgnore
    private Set<FavoriteDto> favorites;

    @JsonIgnore
    private AddressDto address;

    @JsonIgnore
    private Set<CouponDto> coupons;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted;
}
