package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.dto.CouponDTO;

import java.util.List;

public interface CountryService {

    List<CountryDTO> getAlCountries();

    CountryDTO getCountryById(Long id);

    void saveCountry(CountryDTO countryDTO);

    void updateCountry(CountryDTO countryDTO);

    void deleteCountry(Long id);
}
