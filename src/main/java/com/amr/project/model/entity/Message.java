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
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column
    private Chat chat;
    @ManyToOne
    @Column
    private User userFrom;
    @Column
    private String textMessage;
    @Column
    private boolean viewed;
}
