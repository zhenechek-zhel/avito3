package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CountryDto {

    private Long id;
    private String name;


    private List<ShopDto> shops;
    private List<CityDto> cities;
}
