package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cart_item")
@Data
@Builder
public class CartItem {
    //TODO товары в корзине, продумать какие поля им нужны, нужны-ли связи?
    private Long id;
    private String anonID;
    private int quantity;

    @OneToMany(
            mappedBy = "cart",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<User> users;

    @OneToOne(mappedBy = "cartItem", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private Shop shop;


    @OneToMany(
            mappedBy = "cartItemInItem",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Item> itemList;
}
