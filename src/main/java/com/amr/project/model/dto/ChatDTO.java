package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatDTO {

    private Long id;
    private Long hash;

    private Set<MessageDTO> messagesDTO;
    private Set<UserDTO> usersDTO;

}