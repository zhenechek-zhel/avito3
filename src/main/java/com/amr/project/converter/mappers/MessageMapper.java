package com.amr.project.converter.mappers;

import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class, ChatMapper.class})
public interface MessageMapper {
    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    MessageDTO toDTO(Message message);

    Message toEntity(MessageDTO messageDTO);
}
