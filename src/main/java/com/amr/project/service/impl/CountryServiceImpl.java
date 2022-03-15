package com.amr.project.service.impl;

import com.amr.project.converter.mappers.CountryMapper;
import com.amr.project.dao.CountryRepository;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.City;
import com.amr.project.model.entity.Country;
import com.amr.project.service.abstracts.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    @Override
    public List<CountryDTO> getAlCountries() {
        List<Country> countries = countryRepository.findAll();
        return countryMapper.toDTOList(countries);
    }

    @Override
    public CountryDTO getCountryById(Long id) {
        Country country = countryRepository.getById(id);
        return countryMapper.toDTO(country);
    }

    @Override
    public void saveCountry(CountryDTO countryDTO) {
        Country country = countryMapper.toEntity(countryDTO);
        countryRepository.saveAndFlush(country);
    }

    @Override
    public void updateCountry(CountryDTO countryDTO) {
        Country country = countryMapper.toEntity(countryDTO);
        countryRepository.saveAndFlush(country);
    }

    @Override
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}
