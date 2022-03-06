package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinTable(name = "country_city",
    joinColumns = @JoinColumn(name = "city_id"),
    inverseJoinColumns = @JoinColumn(name = "country_id"))
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Address> addresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}