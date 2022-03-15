package com.amr.project.service.abstracts;

import com.amr.project.model.dto.UserInfoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoService {
    List<UserInfoDto> getAllUserInfo();

    UserInfoDto getUserInfoById(Long id);

    void saveUserInfo(UserInfoDto userInfoDTO);

    void updateUserInfo(UserInfoDto userInfoDTO);

    void deleteUserInfo(Long id);
}
