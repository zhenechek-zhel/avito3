package com.amr.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    //TODO добавить поле Дата - фиксация времени создания сообщения
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Chat chat;

    //TODO реализовать связь с Юзером
    @Column(name = "user_to")
    private Long userIdTo;

    //TODO реализовать связь с Юзером
    @Column(name = "user_from")
    private Long userIdFrom;

    private String textMessage;
    private boolean viewed;
}
