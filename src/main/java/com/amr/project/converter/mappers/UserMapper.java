package com.amr.project.converter.mappers;

import com.amr.project.converter.lists.*;
import com.amr.project.model.dto.RolesDTO;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.User;
import com.amr.project.model.enums.Roles;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {OrderListMapper.class, OrderListMapper.class, OrderListMapper.class,
        ReviewListMapper.class,OrderListMapper.class, OrderListMapper.class, OrderListMapper.class,OrderListMapper.class,
        OrderListMapper.class, UserInfoMapper.class, FavoriteMapper.class, AddressMapper.class, OrderListMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);

    @InheritInverseConfiguration
    Roles rolesDtoToRoles(RolesDTO rolesDTO);
}

