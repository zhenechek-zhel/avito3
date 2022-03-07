package com.amr.project.model.entity;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "image")
@Data
@Builder
public class Image {
    //TODO картинки будем хранить в БД (для удобства, хотя это и плохая практика)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private byte[] picture;
    private Boolean isMain = false;


    @OneToOne(mappedBy = "logo")
    private Shop shop;


    @ManyToMany(mappedBy = "images")
    private List<Item> itemsImage;
}
