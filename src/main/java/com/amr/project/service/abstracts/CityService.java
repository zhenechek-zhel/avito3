package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CityDto;

import java.util.List;

public interface CityService {

    List<CityDto> getAllCities();

    CityDto getCityById(Long id);

    void saveCity(CityDto cityDTO);

    void updateCity(CityDto cityDTO);

    void deleteCity(Long id);
}
