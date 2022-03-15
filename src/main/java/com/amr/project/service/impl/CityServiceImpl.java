package com.amr.project.service.impl;

import com.amr.project.converter.mappers.CityMapper;
import com.amr.project.dao.CityRepository;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.Chat;
import com.amr.project.model.entity.City;
import com.amr.project.service.abstracts.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Override
    public List<CityDTO> getAllCities() {
        List<City> cities = cityRepository.findAll();
        return cityMapper.toDTOList(cities);
    }

    @Override
    public CityDTO getCityById(Long id) {
        City city = cityRepository.getById(id);
        return cityMapper.toDTO(city);
    }

    @Override
    public void saveCity(CityDTO cityDTO) {
        City city = cityMapper.toEntity(cityDTO);
        cityRepository.saveAndFlush(city);
    }

    @Override
    public void updateCity(CityDTO cityDTO) {
        City city = cityMapper.toEntity(cityDTO);
        cityRepository.saveAndFlush(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
