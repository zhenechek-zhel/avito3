package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
@Data
@NoArgsConstructor
//@Builder
public class Shop {
    @Id
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String description;
    @ManyToOne
    @JoinColumn(name = "location_ID")
    private Country location;
    @ManyToOne
    private List<Item> items;
    @ManyToOne
    private List<Review> reviews;
    @OneToOne
    private Image logo;
    private int count;
    private double rating;
    private User user;
    private List<Discount> discounts;
    private boolean isModerated = false;
    private boolean isModerateAccept = false;
    private String moderatedRejectReason;
    private boolean isPretendentToBeDeleted = false;
}
