package com.amr.project.service.abstracts;

import com.amr.project.model.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoService {
    List<UserInfoDTO> getAllUserInfo();

    UserInfoDTO getUserInfoById(Long id);

    void saveUserInfo(UserInfoDTO userInfoDTO);

    void updateUserInfo(UserInfoDTO userInfoDTO);

    void deleteUserInfo(Long id);
}
