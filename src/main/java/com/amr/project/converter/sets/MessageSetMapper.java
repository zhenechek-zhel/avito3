package com.amr.project.converter.sets;

import com.amr.project.converter.MessageMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Message;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = MessageMapper.class)
public interface MessageSetMapper {
    Set<MessageDTO> toDTOSet(Set<Message> message);
    Set<Message> toEntitySet(Set<MessageDTO> message);
}
