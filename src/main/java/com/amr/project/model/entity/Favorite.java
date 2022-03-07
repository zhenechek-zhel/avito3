package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "favorite")
@Data
@Builder
public class Favorite {
    //TODO избранные товары пользователя
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "favorite_shop",
                joinColumns = @JoinColumn(name = "favorite_id"),
                inverseJoinColumns = @JoinColumn(name = "shop_id"))
    private Set<Shop> shops;


    @ManyToMany
    @JoinTable(name = "item_shop",
            joinColumns = @JoinColumn(name = "favorite_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Item> items;


    @OneToOne(mappedBy = "favorites", fetch = FetchType.LAZY)
    private User user;
}