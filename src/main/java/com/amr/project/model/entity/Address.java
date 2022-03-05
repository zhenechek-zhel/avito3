package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn(name = "city_ID")
    private City city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String street;
    private String house;
    @ManyToOne
    @JoinTable(name = "user", joinColumns = @JoinColumn(name = "address_id"))
    private User user;

    public Address() {

    }
}
