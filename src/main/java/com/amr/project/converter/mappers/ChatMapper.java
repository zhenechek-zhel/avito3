package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {MessageMapper.class, UserMapper.class})
public interface ChatMapper {
    ChatMapper INSTANCE = Mappers.getMapper(ChatMapper.class);

    ChatDTO toDTO(Chat chat);

    Chat toEntity(ChatDTO chatDTO);
}
