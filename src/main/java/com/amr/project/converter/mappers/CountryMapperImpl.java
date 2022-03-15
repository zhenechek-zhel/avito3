package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapperImpl implements CountryMapper {

    private final CountryMapper countryMapper;

    @Autowired
    public CountryMapperImpl(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

    @Override
    public CountryDTO toDTO(Country country) {
        return countryMapper.toDTO(country);
    }

    @Override
    public Country toEntity(CountryDTO countryDTO) {
        return countryMapper.toEntity(countryDTO);
    }

    @Override
    public List<CountryDTO> toDTOList(List<Country> countries) {
        if (countries == null) return null;
        List<CountryDTO> list = new ArrayList<>(countries.size());
        for (Country country : countries) {
            list.add(countryMapper.toDTO(country));
        }
        return list;
    }

    @Override
    public List<Country> toEntityList(List<CountryDTO> countryDTOS) {
        if (countryDTOS == null) return null;
        List<Country> list = new ArrayList<>(countryDTOS.size());
        for (CountryDTO countryDTO : countryDTOS) {
            list.add(countryMapper.toEntity(countryDTO));
        }
        return list;
    }
}
