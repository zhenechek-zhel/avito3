package com.amr.project.converter.mappers;

import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ShopMapper.class)
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    DiscountDTO toDTO(Discount discount);

    Discount toEntity(DiscountDTO discountDTO);
}
