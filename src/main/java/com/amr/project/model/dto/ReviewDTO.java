package com.amr.project.model.dto;


import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {

    private Long id;
    private String dignity;
    private String flaw;
    private String text;
    private Date date;
    private int rating;
    private UserDTO user;
    private ShopDTO shop;
    private ItemDTO item;


}
