package com.amr.project.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "favorite")
@Data
@Builder
public class Favorite {
    //TODO избранные товары пользователя
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long itemId;
    private User user;
}