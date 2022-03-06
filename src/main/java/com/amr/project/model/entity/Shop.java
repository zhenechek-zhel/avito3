package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String description;
// уточнить имя для связанной колонки
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country location;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "shop")
    private List<Item> items;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "shop")
    private List<Review> reviews;

    @OneToOne
    private Image logo;
    private double rating;
    // уточнить имя для связанной колонки
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "shop")
    private List<Discount> discounts;

    private boolean isModerated = false;
    private boolean isModerateAccept = false;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;
}
