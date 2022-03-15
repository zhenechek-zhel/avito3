package com.amr.project.service.abstracts;

import com.amr.project.model.dto.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAllAddresses();

    AddressDto getAddressById(Long id);

    void saveAddress(AddressDto addressDTO);

    void updateAddress(AddressDto addressDTO);

    void deleteAddress(Long id);
}
