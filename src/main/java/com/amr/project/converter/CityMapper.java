package com.amr.project.converter;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    City toCity(CityDTO cityDTO);

    CityDTO toCityDTO(City city);
}
