package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String cityIndex;
    private String street;
    private String house;


    @ManyToOne
    @JoinColumn(name = "city_ID")
    private City city;


    @OneToMany(
            mappedBy = "address",
            cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            orphanRemoval = true
    )
    private Set<User> users;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "address")
    private Set<Shop> shops;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "address")
    private Set<Order> orders;
}
