package com.amr.project.converter.mappers;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CityMapper.class,
        UserMapper.class, ShopMapper.class, OrderMapper.class})
public interface AddressMapper {

    AddressDTO toDTO(Address address);

    Address toEntity(AddressDTO addressDTO);

    List<AddressDTO> toDTOList(List<Address> addresses);

    List<Address> toEntityList(List<AddressDTO> addressDTOS);
}
