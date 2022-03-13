package com.amr.project.converter;

import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    //MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    Message toMessage(MessageDTO messageDTO);

    MessageDTO toMessageDTO(Message message);
}
