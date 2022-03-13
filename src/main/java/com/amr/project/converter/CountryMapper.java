package com.amr.project.converter;

import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    Country toCountry(CountryDTO countryDTO);

    CountryDTO toCountryDto(Country country);
}
