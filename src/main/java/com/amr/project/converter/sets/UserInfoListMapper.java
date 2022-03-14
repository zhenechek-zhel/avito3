package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.UserInfoMapper;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = UserInfoMapper.class)
public interface UserInfoListMapper {

    UserInfoListMapper INSTANCE = Mappers.getMapper(UserInfoListMapper.class);


    List<UserInfoDTO> toDTOList(List<UserInfo> userInfos);

    List<UserInfo> toEntityList(List<UserInfoDTO> userInfoDTOS);
}
