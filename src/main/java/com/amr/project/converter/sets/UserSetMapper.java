package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.UserMapper;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface UserSetMapper {

    UserSetMapper INSTANCE = Mappers.getMapper(UserSetMapper.class);


    Set<UserDTO> toDTOSet(Set<User> users);

    Set<User> toEntitySet(Set<UserDTO> userDTOS);
}
