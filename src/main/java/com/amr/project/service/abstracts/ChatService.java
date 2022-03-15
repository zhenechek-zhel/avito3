package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ChatDto;

import java.util.List;

public interface ChatService {

    List<ChatDto> getAllChats();

    ChatDto getChatById(Long id);

    void saveChat(ChatDto chatDTO);

    void updateChat(ChatDto chatDTO);

    void deleteChat(Long id);
}
