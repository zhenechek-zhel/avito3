package com.amr.project.converter.mappers;


import com.amr.project.model.dto.GenderDTO;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.UserInfo;
import com.amr.project.model.enums.Gender;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface UserInfoMapper {

    UserInfoDTO toDTO(UserInfo userInfo);

    UserInfo toEntity(UserInfoDTO userInfoDTO);

    List<UserInfoDTO> toDTOList(List<UserInfo> userInfos);

    List<UserInfo> toEntityList(List<UserInfoDTO> userInfoDTOS);


    /*@InheritInverseConfiguration
    Gender genderDtoToGender(GenderDTO genderDTO)*/;


}
