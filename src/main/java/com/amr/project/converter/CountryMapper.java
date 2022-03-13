package com.amr.project.converter;

import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CityListMapper.class, ShopListMapper.class})
public interface CountryMapper {
    CountryDTO toDTO(Country country);
    Country toEntity(CountryDTO countryDTO);
}
