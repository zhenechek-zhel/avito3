package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CityMapperImpl implements CityMapper {

    private final CityMapper cityMapper;

    @Autowired
    public CityMapperImpl(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public CityDTO toDTO(City city) {
        return cityMapper.toDTO(city);
    }

    @Override
    public City toEntity(CityDTO cityDTO) {
        return cityMapper.toEntity(cityDTO);
    }

    @Override
    public List<CityDTO> toDTOList(List<City> cities) {
        if (cities == null) return null;
        List<CityDTO> list = new ArrayList<>(cities.size());
        for (City city : cities) {
            list.add(cityMapper.toDTO(city));
        }
        return list;
    }

    @Override
    public List<City> toEntityList(List<CityDTO> cityDTOS) {
        if (cityDTOS == null) return null;
        List<City> list = new ArrayList<>(cityDTOS.size());
        for (CityDTO cityDTO : cityDTOS) {
            list.add(cityMapper.toEntity(cityDTO));
        }
        return list;
    }
}
