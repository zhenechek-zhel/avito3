package com.amr.project.service.impl;

import com.amr.project.converter.mappers.MessageMapper;
import com.amr.project.dao.MessageRepository;
import com.amr.project.model.dto.MessageDto;
import com.amr.project.model.entity.Message;
import com.amr.project.service.abstracts.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    @Override
    public List<MessageDto> getAllMessages() {
        return messageMapper.toDTOList(messageRepository.findAll());
    }

    @Override
    public MessageDto getMessageById(Long id) {
        return messageMapper.toDTO(messageRepository.getById(id));
    }


    @Override
    public void saveMessage(MessageDto messageDTO) {
        Message message = messageMapper.toEntity((messageDTO));
        messageRepository.saveAndFlush(message);
    }

    @Override
    public void updateMessage(MessageDto messageDTO) {
        Message message = messageMapper.toEntity((messageDTO));
        messageRepository.saveAndFlush(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
