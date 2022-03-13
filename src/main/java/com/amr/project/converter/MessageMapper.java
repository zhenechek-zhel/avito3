package com.amr.project.converter;

import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MessageDTO toDTO(Message message);
    Message toEntity(MessageDTO messageDTO);
}
