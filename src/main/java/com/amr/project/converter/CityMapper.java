package com.amr.project.converter;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, CouponMapper.class})
public interface CityMapper {
    CityDTO toDTO(City city);
    City toEntity(CityDTO cityDTO);
}