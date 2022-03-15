package com.amr.project.converter.mappers;

import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Category;
import com.amr.project.model.entity.Message;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ChatMapper.class})
public interface MessageMapper {

    MessageDTO toDTO(Message message);

    Message toEntity(MessageDTO messageDTO);

    List<MessageDTO> toDTOList(List<Message> messages);

    List<Message> toEntityList(List<MessageDTO> messageDTOS);
}
