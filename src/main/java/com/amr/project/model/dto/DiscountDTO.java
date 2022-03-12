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
public class DiscountDTO {

    private Long id;
    private Integer minOrder;
    private Integer percentage;
    private Integer fixedDiscount;

    private ShopDTO shopDTO;



}
