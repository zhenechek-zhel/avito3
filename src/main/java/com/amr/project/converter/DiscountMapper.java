package com.amr.project.converter;

import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DiscountMapper.class, ShopMapper.class})
public interface DiscountMapper {
    DiscountDTO toDTO(Discount discount);
    Discount toEntity(DiscountDTO discountDTO);
}
