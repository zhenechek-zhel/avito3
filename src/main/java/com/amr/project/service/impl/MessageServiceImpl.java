package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ItemMapper;
import com.amr.project.converter.mappers.MessageMapper;
import com.amr.project.dao.ItemRepository;
import com.amr.project.dao.MessageRepository;
import com.amr.project.dao.UserRepository;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Item;
import com.amr.project.model.entity.Message;
import com.amr.project.model.entity.User;
import com.amr.project.service.abstracts.MessageService;
import com.amr.project.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    @Override
    public List<MessageDTO> getAllMessages() {
        return messageMapper.toDTOList(messageRepository.findAll());
    }

    @Override
    public MessageDTO getMessageById(Long id) {
        return messageMapper.toDTO(messageRepository.getById(id));
    }

    @Override
    public void saveMessage(MessageDTO messageDTO) {
        Message message = messageMapper.toEntity((messageDTO));
        messageRepository.saveAndFlush(message);
    }

    @Override
    public void updateMessage(MessageDTO messageDTO) {
        Message message = messageMapper.toEntity((messageDTO));
        messageRepository.saveAndFlush(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
