package com.amr.project.converter;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDTO toDTO(City city);
    City toEntity(CityDTO cityDTO);
}