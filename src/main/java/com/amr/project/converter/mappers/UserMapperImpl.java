package com.amr.project.converter.mappers;

import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapperImpl implements UserMapper {

    private final UserMapper userMapper;

    @Autowired
    public UserMapperImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public UserDTO toDTO(User user) {
        return userMapper.toDTO(user);
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        return userMapper.toEntity(userDTO);
    }

    @Override
    public List<UserDTO> toDTOList(List<User> users) {
        if (users == null) return null;
        List<UserDTO> list = new ArrayList<>(users.size());
        for (User user : users) {
            list.add(userMapper.toDTO(user));
        }
        return list;
    }

    @Override
    public List<User> toEntityList(List<UserDTO> userDTOS) {
        if (userDTOS == null) return null;
        List<User> list = new ArrayList<>(userDTOS.size());
        for (UserDTO userDTO : userDTOS) {
            list.add(userMapper.toEntity(userDTO));
        }
        return list;
    }
}
