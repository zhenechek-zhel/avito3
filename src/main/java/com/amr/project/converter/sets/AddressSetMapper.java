package com.amr.project.converter.sets;


import com.amr.project.converter.*;
import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface AddressSetMapper {
    Set<AddressDTO> toDTOSet(Set<Address> addresses);
    Set<Address> toEntitySet(Set<AddressDTO> addressDTOS);

}
