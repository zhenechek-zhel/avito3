package com.amr.project.service.impl;

import com.amr.project.converter.mappers.UserInfoMapper;
import com.amr.project.dao.UserInfoRepository;
import com.amr.project.model.dto.UserInfoDto;
import com.amr.project.model.entity.UserInfo;
import com.amr.project.service.abstracts.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoRepository userInfoRepository;
    private final UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfoDto> getAllUserInfo() {
        return userInfoMapper.toDTOList(userInfoRepository.findAll());
    }

    @Override
    public UserInfoDto getUserInfoById(Long id) {
        return userInfoMapper.toDTO(userInfoRepository.getById(id));
    }

    @Override
    public void saveUserInfo(UserInfoDto userInfoDTO) {
        UserInfo userInfo =  userInfoMapper.toEntity(userInfoDTO);
        userInfoRepository.saveAndFlush(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfoDto userInfoDTO) {
        UserInfo userInfo =  userInfoMapper.toEntity(userInfoDTO);
        userInfoRepository.saveAndFlush(userInfo);
    }

    @Override
    public void deleteUserInfo(Long id) {
        userInfoRepository.deleteById(id);
    }
}

