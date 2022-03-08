package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cart_item")
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
            mappedBy = "cartItem",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Item> itemList;
}
