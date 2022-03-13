package com.amr.project.converter.sets;

import com.amr.project.converter.MessageMapper;
import com.amr.project.converter.UserMapper;
import com.amr.project.model.dto.CartItemDTO;
import com.amr.project.model.dto.ChatDTO;
import com.amr.project.model.entity.CartItem;
import com.amr.project.model.entity.Chat;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ChatSetMapper.class)
public interface ChatSetMapper {

    Set<ChatDTO> toDTOSet(Set<Chat> chats);
    Set<Chat> toEntitySet(Set<ChatDTO> chatDTOS);
}
