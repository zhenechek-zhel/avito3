package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "message")
@Data
@Builder
public class Message {
    @Id
    private Long id;
    @ManyToMany

    private Set<Chat> chats;

    private User to;
    private User from;
    private String textMessage;
    private boolean viewed;
}
