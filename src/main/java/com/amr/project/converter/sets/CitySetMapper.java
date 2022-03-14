package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.CityMapper;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = CityMapper.class)
public interface CitySetMapper {

    CitySetMapper INSTANCE = Mappers.getMapper(CitySetMapper.class);

    Set<CityDTO> toDTOSet(Set<City> cities);

    Set<City> toEntitySet(Set<CityDTO> cityDTOS);
}

