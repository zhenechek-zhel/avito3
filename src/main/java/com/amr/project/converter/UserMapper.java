package com.amr.project.converter;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.Address;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
