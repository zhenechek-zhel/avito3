package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cart_items")
@Data
@Builder
public class CartItem {
    //TODO товары в корзине, продумать какие поля им нужны, нужны-ли связи?

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "quantity")
    private int quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

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
