package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;
    @Column
    private String description;

    private int count;

    private double rating;
    // уточнить имя для связанной колонки


    @ManyToOne(fetch = FetchType.LAZY)
    private Country location;


    @OneToMany(
            mappedBy = "shop",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Item> items;


    @OneToMany(
            mappedBy = "shop",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Review> reviews;


    @OneToOne(mappedBy = "shop", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Image logo;


    @ManyToMany(mappedBy = "shops")
    private Set<User> users;


    @OneToOne(mappedBy = "shop", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private CartItem cartItem;


    @OneToMany(
            mappedBy = "shop",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Feedback> feedback;


    @OneToMany(mappedBy = "shop",
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH},
            orphanRemoval = true)
    private Set<Discount> discounts;


    @ManyToMany(mappedBy = "shops")
    private Set<Favorite> favorites;


    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "shop_id")
    private Set<Coupon> coupons;


    @ManyToOne(fetch = FetchType.LAZY)
    private City city;


    private boolean isModerated = false;
    private boolean isModerateAccept = false;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;
}
