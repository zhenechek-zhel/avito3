package com.amr.project.converter;

import com.amr.project.model.dto.GenderDTO;
import com.amr.project.model.enums.Gender;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenderMapper {
    GenderMapper INSTANCE = Mappers.getMapper(GenderMapper.class);
    GenderDTO toDTO(Gender gender);
    Gender toEntity(GenderDTO gender);
}
