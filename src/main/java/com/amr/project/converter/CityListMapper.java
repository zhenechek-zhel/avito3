package com.amr.project.converter;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface CityListMapper {
    List<CityDTO> toDTOList(List<City> city);
    List<City> toEntityList(List<CityDTO> city);
}

