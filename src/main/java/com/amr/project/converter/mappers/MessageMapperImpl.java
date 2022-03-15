package com.amr.project.converter.mappers;

import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageMapperImpl implements MessageMapper {

    private final MessageMapper messageMapper;

    @Autowired
    public MessageMapperImpl(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @Override
    public MessageDTO toDTO(Message message) {
        return messageMapper.toDTO(message);
    }

    @Override
    public Message toEntity(MessageDTO messageDTO) {
        return messageMapper.toEntity(messageDTO);
    }

    @Override
    public List<MessageDTO> toDTOList(List<Message> messages) {
        if (messages == null) return null;
        List<MessageDTO> list = new ArrayList<>(messages.size());
        for (Message message : messages) {
            list.add(messageMapper.toDTO(message));
        }
        return list;
    }

    @Override
    public List<Message> toEntityList(List<MessageDTO> messageDTOS) {
        if (messageDTOS == null) return null;
        List<Message> list = new ArrayList<>(messageDTOS.size());
        for (MessageDTO messageDTO : messageDTOS) {
            list.add(messageMapper.toEntity(messageDTO));
        }
        return list;
    }
}
