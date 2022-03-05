package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
@Data
@Builder
public class Shop {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    private Country location;
    private List<Item> items;
    private List<Review> reviews;
    private Image logo;
    private int count;
    private double rating;
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartItem_id")
    private CartItem cartItem;

    private List<Discount> discounts;
    private boolean isModerated = false;
    private boolean isModerateAccept = false;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;
}
