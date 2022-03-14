package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.CountryMapper;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = CountryMapper.class)
public interface CountryListMapper {

    CountryListMapper INSTANCE = Mappers.getMapper(CountryListMapper.class);

    List<CountryDTO> toDTOList(List<Country> countries);

    List<Country> toEntityList(List<CountryDTO> countryDTOS);
}
