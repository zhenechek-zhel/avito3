package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;



@Data
@Builder
@Entity
@Table(name = "shop")
@NoArgsConstructor
@AllArgsConstructor
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
            orphanRemoval = false
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


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    @OneToOne(mappedBy = "shop", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private CartItem cartItem;


    @OneToMany(
            mappedBy = "shop",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Feedback> feedbacks;


    @OneToMany(
            mappedBy = "shop",
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



    private boolean isModerated = false;
    private boolean isModerateAccept = false;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;
}
