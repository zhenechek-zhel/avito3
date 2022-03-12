package com.amr.project.model.dto;

import com.amr.project.model.entity.Message;
import com.amr.project.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    public ChatDTO(Set<User> members) {
        this.users = members;
        this.hash = members.stream().map(User::hashCode).mapToLong(e -> e).sum();
    }
}