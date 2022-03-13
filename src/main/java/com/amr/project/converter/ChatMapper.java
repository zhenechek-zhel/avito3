package com.amr.project.converter;

import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    ChatMapper INSTANCE = Mappers.getMapper(ChatMapper.class);

    Chat toChat(ChatDTO chatDTO);

    ChatDTO toChatDTO(Chat chat);
}
