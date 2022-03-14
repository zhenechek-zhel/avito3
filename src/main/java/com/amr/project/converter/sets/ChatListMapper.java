package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ChatMapper;
import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper( uses = ChatMapper.class)
public interface ChatListMapper {

    ChatListMapper INSTANCE = Mappers.getMapper(ChatListMapper.class);

    List<ChatDTO> toDTOList(List<Chat> chats);

    List<Chat> toEntityList(List<ChatDTO> chatDTOS);
}
