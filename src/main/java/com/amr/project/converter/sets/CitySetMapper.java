package com.amr.project.converter.sets;

import com.amr.project.converter.CityMapper;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.*;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface CitySetMapper {
    Set<CityDTO> toDTOSet(Set<City> cities);
    Set<City> toEntitySet(Set<CityDTO> cityDTOS);
}

