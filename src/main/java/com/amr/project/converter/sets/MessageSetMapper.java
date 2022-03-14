package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.MessageMapper;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = MessageMapper.class)
public interface MessageSetMapper {

    MessageSetMapper INSTANCE = Mappers.getMapper(MessageSetMapper.class);

    Set<MessageDTO> toDTOSet(Set<Message> messages);

    Set<Message> toEntitySet(Set<MessageDTO> messageDTOS);
}
