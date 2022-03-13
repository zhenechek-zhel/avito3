package com.amr.project.converter.sets;

import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.dto.CountryDTO;
import com.amr.project.model.entity.CartItem;
import com.amr.project.model.entity.Country;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CountrySetMapper.class)
public interface CountrySetMapper {

    Set<CountryDTO> toDTOSet(Set<Country> countries);
    Set<Country> toEntitySet(Set<CountryDTO> countryDTOS);
}
