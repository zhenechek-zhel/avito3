package com.amr.project.service.abstracts;

import com.amr.project.model.dto.MessageDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<MessageDto> getAllMessages();

    MessageDto getMessageById(Long id);

    void saveMessage(MessageDto messageDTO);

    void updateMessage(MessageDto messageDTO);

    void deleteMessage(Long id);
}
