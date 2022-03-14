package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.MessageMapper;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = MessageMapper.class)
public interface MessageListMapper {

    MessageListMapper INSTANCE = Mappers.getMapper(MessageListMapper.class);

    List<MessageDTO> toDTOList(List<Message> messages);

    List<Message> toEntityList(List<MessageDTO> messageDTOS);
}
