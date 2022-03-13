package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.CountryMapper;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CountrySetMapper {

    CountrySetMapper INSTANCE = Mappers.getMapper(CountrySetMapper.class);

    Set<CountryDTO> toDTOSet(Set<Country> countries);

    Set<Country> toEntitySet(Set<CountryDTO> countryDTOS);
}
