package com.amr.project.model.dto;

import com.amr.project.model.entity.City;
import com.amr.project.model.entity.Shop;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.Set;

public class CountryDto {

    private String name;

    private Set<ShopDto> shops;

    @JsonIgnore
    private Set<CityDto> cities;
}
