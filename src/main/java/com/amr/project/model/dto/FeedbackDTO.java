package com.amr.project.model.dto;

import com.amr.project.model.entity.Shop;
import com.amr.project.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {
    private Long id;
    private String reason;
    private String fullText;
    private LocalDateTime dateTime;
    private String username;

    private ShopDTO shopDTO;
    private UserDTO userDTO;

}