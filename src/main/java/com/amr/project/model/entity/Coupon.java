package com.amr.project.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
@Table(name = "coupon")
@Data
public class Coupon {
    //TODO разовый скидочный купон для покупателя, добавить поля
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private Calendar start;
    private Calendar end;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;


    @ManyToMany(mappedBy = "coupons")
    private Set<User> usersInCoupon;
}
