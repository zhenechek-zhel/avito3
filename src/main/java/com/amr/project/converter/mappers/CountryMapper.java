package com.amr.project.converter.mappers;

import com.amr.project.converter.lists.ShopListMapper;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ShopListMapper.class, ShopListMapper.class})
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDTO toDTO(Country country);

    Country toEntity(CountryDTO countryDTO);
}
