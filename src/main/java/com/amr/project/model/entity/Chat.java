package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "chat")
@Data
@Builder
public class Chat {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "chat_members",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "members_id"))
    private List<User> members;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chat_messages",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "messages_id"))
    private List<Message> messages;
    private Long hash;
    public Chat(List<User> members) {
        this.members = members;
        this.hash = members.stream().map(User::hashCode).mapToLong(e -> e).sum();
    }
}