package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.annotation.Generated;
import java.util.List;

@Mapper(componentModel = "spring", uses = {AddressMapper.class, CouponMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CityMapper {

    CityDTO toDTO(City city);

    City toEntity(CityDTO cityDTO);

    List<CityDTO> toDTOList(List<City> cities);

    List<City> toEntityList(List<CityDTO> cityDTOS);
}