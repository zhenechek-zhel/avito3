package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "item")
@Data
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    private String name;
    private BigDecimal basePrice;
    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "item_category",
    joinColumns = @JoinColumn(name = "item_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;


    private List<Image> images;
    private List<Review> reviews;
    private int count;
    private double rating;
    private String description;
    private int discount;
    private Shop shop;
    private boolean isModerated = false;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
