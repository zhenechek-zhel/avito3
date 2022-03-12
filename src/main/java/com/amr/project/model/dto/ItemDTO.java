package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    private Long id;

    private String name;
    private BigDecimal basePrice;
    private BigDecimal price;
    private int count;
    private double rating;
    private String description;
    private int discount;

    private CategoryDto categoryDTO;
    private CartItemDto cartItemDTO;
    private Set<ImageDto> imagesDTO;
    private Set<ReviewDto> reviewsDTO;
    private Set<FavoriteDto> favoritesDTO;
    private Set<OrderDto> ordersDTO;
    private ShopDto shopDTO;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
