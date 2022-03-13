package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MessageDTO {
    private Long id;
    private Date date;
    private String textMessage;
    private boolean viewed;


    private UserDTO userDTO;
    private ChatDTO chatDTO;

}
