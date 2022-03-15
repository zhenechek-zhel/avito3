package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMapperImpl implements ChatMapper {

    private final ChatMapper chatMapper;

    @Autowired
    public ChatMapperImpl(ChatMapper chatMapper) {
        this.chatMapper = chatMapper;
    }

    @Override
    public ChatDTO toDTO(Chat chat) {
        return chatMapper.toDTO(chat);
    }

    @Override
    public Chat toEntity(ChatDTO chatDTO) {
        return chatMapper.toEntity(chatDTO);
    }

    @Override
    public List<ChatDTO> toDTOList(List<Chat> chats) {
        if (chats == null) return null;
        List<ChatDTO> list = new ArrayList<>(chats.size());
        for (Chat chat : chats) {
            list.add(chatMapper.toDTO(chat));
        }
        return list;
    }

    @Override
    public List<Chat> toEntityList(List<ChatDTO> chatDTOS) {
        if (chatDTOS == null) return null;
        List<Chat> list = new ArrayList<>(chatDTOS.size());
        for (ChatDTO chatDTO : chatDTOS) {
            list.add(chatMapper.toEntity(chatDTO));
        }
        return list;
    }
}
