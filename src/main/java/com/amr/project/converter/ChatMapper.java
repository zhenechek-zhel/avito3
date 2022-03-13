package com.amr.project.converter;

import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {MessageMapper.class, UserMapper.class})
public interface ChatMapper {
    ChatDTO toDTO(Chat chat);
    Chat toEntity(ChatDTO chatDTO);
}
