package com.amr.project.converter.sets;

import com.amr.project.converter.ShopMapper;
import com.amr.project.converter.UserMapper;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.Shop;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface UserSetMapper {
    Set<UserDTO> toDTOSet(Set<User> users);
    Set<User> toEntitySet(Set<UserDTO> userDTOS);
}
