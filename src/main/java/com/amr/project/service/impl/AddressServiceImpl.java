package com.amr.project.service.impl;

import com.amr.project.converter.mappers.AddressMapper;
import com.amr.project.dao.AddressRepository;
import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.entity.Address;
import com.amr.project.service.abstracts.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public List<AddressDTO> getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        return addressMapper.toDTOList(addresses);
    }

    @Override
    public AddressDTO getAddressById(Long id) {
        Address address = addressRepository.getById(id);
        return addressMapper.toDTO(address);
    }

    @Override
    public void saveAddress(AddressDTO addressDTO) {
        Address address = addressMapper.toEntity(addressDTO);
        addressRepository.saveAndFlush(address);
    }

    @Override
    public void updateAddress(AddressDTO addressDTO) {
        Address address = addressMapper.toEntity(addressDTO);
        addressRepository.saveAndFlush(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
