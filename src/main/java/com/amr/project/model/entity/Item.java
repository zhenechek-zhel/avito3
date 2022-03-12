package com.amr.project.model.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "base_price")
    private BigDecimal basePrice;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "count")
    private int count;

    @Column(name = "rating")
    private double rating;


    private String description;
    private int discount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;



    @ManyToOne(fetch = FetchType.LAZY)
    private CartItem cartItem;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "item_id")
    private Set<Image> images;


    @OneToMany(
            mappedBy = "item",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Review> reviews;


    @ManyToMany(mappedBy = "items")
    private Set<Favorite> favorites;


    @ManyToMany(mappedBy = "itemsInOrder")
    private Set<Order> orders;

    @ManyToOne(fetch = FetchType.LAZY)
    private Shop shop;


    private boolean isModerated;
    private boolean isModerateAccept;
    private String moderatedRejectReason;
    private boolean isPretendedToBeDeleted;
}
