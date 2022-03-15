package com.amr.project.service.abstracts;
import com.amr.project.model.dto.UserDto;
import com.amr.project.model.entity.User;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    void updateUser(UserDto userDto);

    void deleteUserById(Long id);

    void saveUser(UserDto userDto);

    User getUserByEmail(String email);
}
