package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MessageMapper.class, UserMapper.class})
public interface ChatMapper {

    ChatDTO toDTO(Chat chat);

    Chat toEntity(ChatDTO chatDTO);

    List<ChatDTO> toDTOList(List<Chat> chats);

    List<Chat> toEntityList(List<ChatDTO> chatDTOS);
}
