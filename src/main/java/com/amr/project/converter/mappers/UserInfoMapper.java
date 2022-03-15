package com.amr.project.converter.mappers;


import com.amr.project.model.dto.UserInfoDto;
import com.amr.project.model.entity.UserInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface UserInfoMapper {

    UserInfoDto toDTO(UserInfo userInfo);

    UserInfo toEntity(UserInfoDto userInfoDTO);

    List<UserInfoDto> toDTOList(List<UserInfo> userInfos);

    List<UserInfo> toEntityList(List<UserInfoDto> userInfoDtos);


    /*@InheritInverseConfiguration
    Gender genderDtoToGender(GenderDTO genderDTO)*/;


}
