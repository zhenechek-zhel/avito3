package com.amr.project.converter;

import ch.qos.logback.core.status.Status;
import com.amr.project.model.dto.StatusDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StatusMapper {
    StatusMapper INSTANCE = Mappers.getMapper(StatusMapper.class);
    StatusDTO toDTO(Status status);
    Status toEntity(StatusDTO status);
}
