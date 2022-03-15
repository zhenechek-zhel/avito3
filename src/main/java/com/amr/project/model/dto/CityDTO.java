package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CityDTO {

    private Long id;
    private String name;

    private List<AddressDTO> addresses;
    private CountryDTO country;

}