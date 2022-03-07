package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "discount")
@Data
@Builder
public class Discount {
    //TODO скидка для постоянного покупателя
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "min_order")
    private Integer minOrder;

    @Column(name = "percentage")
    private Integer percentage;

    @Column(name = "fixed_discount")
    private Integer fixedDiscount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
