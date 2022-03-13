package com.amr.project.converter;

import com.amr.project.model.dto.RolesDTO;
import com.amr.project.model.enums.Roles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RolesMapper {
    RolesMapper INSTANCE = Mappers.getMapper(RolesMapper.class);
    RolesDTO toDTO(Roles roles);
    Roles toEntity(RolesDTO rolesDto);
}
