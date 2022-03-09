package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "chat")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    @Id
    @GeneratedValue
    private Long id;
    private Long hash;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "chat_id")
    private Set<Message> messages;

    @ManyToMany(mappedBy = "chats")
    private Set<User> users;



    public Chat(Set<User> members) {
        this.users = members;
        this.hash = members.stream().map(User::hashCode).mapToLong(e -> e).sum();
    }
}