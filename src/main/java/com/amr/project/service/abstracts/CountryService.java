package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CountryDto;

import java.util.List;

public interface CountryService {

    List<CountryDto> getAlCountries();

    CountryDto getCountryById(Long id);

    void saveCountry(CountryDto countryDTO);

    void updateCountry(CountryDto countryDTO);

    void deleteCountry(Long id);
}
