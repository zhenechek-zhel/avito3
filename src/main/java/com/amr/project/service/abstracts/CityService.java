package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CityDTO;

import java.util.List;

public interface CityService {

    List<CityDTO> getAllCities();

    CityDTO getCityById(Long id);

    void saveCity(CityDTO cityDTO);

    void updateCity(CityDTO cityDTO);

    void deleteCity(Long id);
}
