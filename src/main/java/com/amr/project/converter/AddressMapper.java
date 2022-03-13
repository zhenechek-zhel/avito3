package com.amr.project.converter;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDTO toDTO(Address address);
    Address toEntity(AddressDTO addressDTO);
}
