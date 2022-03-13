package com.amr.project.converter;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CityMapper.class, UserMapper.class, ShopMapper.class, OrderMapper.class})
public interface AddressMapper {
    AddressDTO toDTO(Address address);
    Address toEntity(AddressDTO addressDTO);
}
