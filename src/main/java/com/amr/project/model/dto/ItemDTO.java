package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
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
    private List<ImageDTO> imagesDTO;
    private List<ReviewDTO> reviewsDTO;
    private List<FavoriteDTO> favoritesDTO;
    private List<OrderDTO> ordersDTO;
    private ShopDTO shopDTO;

    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
