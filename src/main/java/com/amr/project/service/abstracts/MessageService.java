package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<MessageDTO> getAllMessages();

    MessageDTO getMessageById(Long id);

    void saveMessage(MessageDTO messageDTO);

    void updateMessage(MessageDTO messageDTO);

    void deleteMessage(Long id);
}
