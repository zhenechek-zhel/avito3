package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
@Data
@Builder
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


    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;


    @OneToMany(
            mappedBy = "address",
            cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            orphanRemoval = true
    )
    private Set<User> users;

    public Address() {

    }
}
