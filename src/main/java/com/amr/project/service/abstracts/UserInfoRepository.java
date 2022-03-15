package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoRepository {
    List<UserInfoDTO> getAllUserInfo();

    UserInfoDTO getUserInfoById(Long id);

    void saveUserInfo(UserInfoDTO userInfoDTO);

    void updateUserInfo(UserInfoDTO userInfoDTO);

    void deleteUserInfo(Long id);
}
