package com.amr.project.model.dto;

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

    private CategoryDTO categoryDTO;
    private CartItemDTO cartItemDTO;
    private Set<ImageDTO> imagesDTO;
    private Set<ReviewDTO> reviewsDTO;
    private Set<FavoriteDTO> favoritesDTO;
    private Set<OrderDTO> ordersDTO;
    private ShopDTO shopDTO;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
