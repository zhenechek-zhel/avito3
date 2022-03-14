package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.CityMapper;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = CityMapper.class)
public interface CityListMapper {

    CityListMapper INSTANCE = Mappers.getMapper(CityListMapper.class);

    List<CityDTO> toDTOList(List<City> cities);

    List<City> toEntityList(List<CityDTO> cityDTOS);
}

