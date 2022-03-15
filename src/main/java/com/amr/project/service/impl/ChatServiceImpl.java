package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ChatMapper;
import com.amr.project.dao.ChatRepository;
import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.Chat;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatRepository chatRepository;
    private final ChatMapper chatMapper;


    @Override
    public List<ChatDTO> getAllChats() {
        List<Chat> chats = chatRepository.findAll();
        return chatMapper.toDTOList(chats);
    }

    @Override
    public ChatDTO getChatById(Long id) {
        Chat chat = chatRepository.getById(id);
        return chatMapper.toDTO(chat);
    }

    @Override
    public void saveChat(ChatDTO chatDTO) {
        Chat chat = chatMapper.toEntity(chatDTO);
        chatRepository.saveAndFlush(chat);
    }

    @Override
    public void updateChat(ChatDTO chatDTO) {
        Chat chat = chatMapper.toEntity(chatDTO);
        chatRepository.saveAndFlush(chat);
    }

    @Override
    public void deleteChat(Long id) {
        chatRepository.deleteById(id);
    }
}
