package com.amr.project.converter.sets;


import com.amr.project.converter.CityMapper;
import com.amr.project.converter.OrderMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.converter.UserMapper;
import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = AddressSetMapper.class)
public interface AddressSetMapper {
    Set<AddressDTO> toDTOSet(Set<Address> addresses);
    Set<Address> toEntitySet(Set<AddressDTO> addressDTOS);

}
