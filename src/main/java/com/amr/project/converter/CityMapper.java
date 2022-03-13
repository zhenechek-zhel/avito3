package com.amr.project.converter;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {AddressMapper.class, CouponMapper.class})
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);
    CityDTO toDTO(City city);
    City toEntity(CityDTO cityDTO);
}