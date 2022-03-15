package com.amr.project.converter.mappers;

import com.amr.project.model.dto.GenderDTO;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.UserInfo;
import com.amr.project.model.enums.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserInfoMapperImpl implements UserInfoMapper {

    private final UserInfoMapper userInfoMapper;

    @Autowired
    public UserInfoMapperImpl(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }


    @Override
    public UserInfoDTO toDTO(UserInfo userInfo) {
        return userInfoMapper.toDTO(userInfo);
    }

    @Override
    public UserInfo toEntity(UserInfoDTO userInfoDTO) {
        return userInfoMapper.toEntity(userInfoDTO);
    }

    @Override
    public List<UserInfoDTO> toDTOList(List<UserInfo> userInfos) {
        if (userInfos == null) return null;
        List<UserInfoDTO> list = new ArrayList<>(userInfos.size());
        for (UserInfo userInfo : userInfos) {
            list.add(userInfoMapper.toDTO(userInfo));
        }
        return list;
    }

    @Override
    public List<UserInfo> toEntityList(List<UserInfoDTO> userInfoDTOS) {
        if (userInfoDTOS == null) return null;
        List<UserInfo> list = new ArrayList<>(userInfoDTOS.size());
        for (UserInfoDTO userInfoDTO : userInfoDTOS) {
            list.add(userInfoMapper.toEntity(userInfoDTO));
        }
        return list;
    }

    /*@Override
    public Gender genderDtoToGender(GenderDTO genderDTO) {
        return null;
    }*/
}
