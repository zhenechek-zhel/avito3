package com.amr.project.converter.sets;

import com.amr.project.converter.ShopMapper;
import com.amr.project.converter.UserInfoMapper;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.dto.UserInfoDTO;
import com.amr.project.model.entity.Shop;
import com.amr.project.model.entity.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = UserInfoMapper.class)
public interface UserInfoSetMapper {

    UserInfoSetMapper INSTANCE = Mappers.getMapper(UserInfoSetMapper.class);


    Set<UserInfoDTO> toDTOSet(Set<UserInfo> userInfos);
    Set<UserInfo> toEntitySet(Set<UserInfoDTO> userInfoDTOS);
}
