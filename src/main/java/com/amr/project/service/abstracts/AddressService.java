package com.amr.project.service.abstracts;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.CategoryDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAllAddresses();

    AddressDTO getAddressById(Long id);

    void saveAddress(AddressDTO addressDTO);

    void updateAddress(AddressDTO addressDTO);

    void deleteAddress(Long id);
}
