package com.amr.project.converter;

import com.amr.project.converter.sets.CitySetMapper;
import com.amr.project.converter.sets.ShopSetMapper;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CitySetMapper.class, ShopSetMapper.class})
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    CountryDTO toDTO(Country country);
    Country toEntity(CountryDTO countryDTO);
}
