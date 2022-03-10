package com.amr.project.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chat")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chat implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Long hash;


    //TODO реализовать обратную связь (с User)
    @ManyToMany(mappedBy = "chats")
        private Set<User> users = new HashSet<>();


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