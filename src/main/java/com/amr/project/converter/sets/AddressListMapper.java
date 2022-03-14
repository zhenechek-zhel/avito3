package com.amr.project.converter.sets;


import com.amr.project.converter.mappers.AddressMapper;
import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = AddressMapper.class)
public interface AddressListMapper {

    AddressListMapper INSTANCE = Mappers.getMapper(AddressListMapper.class);

    List<AddressDTO> toDTOList(List<Address> addresses);

    List<Address> toEntityList(List<AddressDTO> addressDTOS);

}
