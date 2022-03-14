package com.amr.project.converter.mappers;


import com.amr.project.model.dto.GenderDTO;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.UserInfo;
import com.amr.project.model.enums.Gender;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UserMapper.class)
public interface UserInfoMapper {
    UserInfoMapper INSTANCE = Mappers.getMapper(UserInfoMapper.class);

    UserInfoDTO toDTO(UserInfo userInfo);

    UserInfo toEntity(UserInfoDTO userInfoDTO);


    @InheritInverseConfiguration
    Gender genderDtoToGender(GenderDTO genderDTO);


}
