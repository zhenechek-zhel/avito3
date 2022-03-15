package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.dto.ChatDTO;

import java.util.List;

public interface ChatService {

    List<ChatDTO> getAllChats();

    ChatDTO getChatById(Long id);

    void saveChat(ChatDTO chatDTO);

    void updateChat(ChatDTO chatDTO);

    void deleteChat(Long id);
}
