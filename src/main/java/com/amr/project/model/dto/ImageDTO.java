package com.amr.project.model.dto;


import com.amr.project.model.entity.Shop;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDTO {
    private Long id;
    private byte[] picture;
    private Boolean isMain = false;

    private ShopDTO shopDTO;


}
