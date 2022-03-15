package com.amr.project.converter.mappers;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressMapperImpl implements AddressMapper {

    private final AddressMapper addressMapper;

    @Autowired
    public AddressMapperImpl(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }


    @Override
    public AddressDTO toDTO(Address address) {
        return addressMapper.toDTO(address);
    }

    @Override
    public Address toEntity(AddressDTO addressDTO) {
        return addressMapper.toEntity(addressDTO);
    }

    @Override
    public List<AddressDTO> toDTOList(List<Address> addresses) {
        if (addresses == null) return null;

        List<AddressDTO> list = new ArrayList<>(addresses.size());
        for (Address address : addresses) {
            list.add(addressMapper.toDTO(address));
        }
        return list;
    }

    @Override
    public List<Address> toEntityList(List<AddressDTO> addressDTOS) {
        if (addressDTOS == null) return null;

        List<Address> list = new ArrayList<>(addressDTOS.size());
        for (AddressDTO addressDTO : addressDTOS) {
            list.add(addressMapper.toEntity(addressDTO));
        }
        return list;
    }
}
