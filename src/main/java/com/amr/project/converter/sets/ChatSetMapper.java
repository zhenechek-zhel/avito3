package com.amr.project.converter.sets;

import com.amr.project.converter.ChatMapper;
import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ChatMapper.class)
public interface ChatSetMapper {

    ChatSetMapper INSTANCE = Mappers.getMapper(ChatSetMapper.class);

    Set<ChatDTO> toDTOSet(Set<Chat> chats);
    Set<Chat> toEntitySet(Set<ChatDTO> chatDTOS);
}
