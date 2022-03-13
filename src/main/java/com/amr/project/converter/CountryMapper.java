package com.amr.project.converter;

import com.amr.project.converter.sets.CitySetMapper;
import com.amr.project.converter.sets.ShopSetMapper;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CitySetMapper.class, ShopSetMapper.class})
public interface CountryMapper {
    CountryDTO toDTO(Country country);
    Country toEntity(CountryDTO countryDTO);
}
