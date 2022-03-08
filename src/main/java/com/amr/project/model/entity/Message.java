package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Chat chat;

    @OneToOne
    @JoinColumn(name = "userTo_id")
    private User userTo;

    @OneToOne
    @JoinColumn(name = "userFrom_id")
    private User userFrom;

    private String textMessage;
    private boolean viewed;
}
