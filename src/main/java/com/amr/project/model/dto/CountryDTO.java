package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CountryDTO {

    private Long id;
    private String name;


    private Set<ShopDTO> shopsDTO;
    private Set<CityDTO> citiesDTO;
}
