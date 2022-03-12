package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
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
    private Category category;
    private CartItem cartItem;
    private Set<Image> images;
    private Set<Review> reviews;
    private Set<Favorite> favorites;
    private Set<Order> orders;
    private Shop shop;
    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
