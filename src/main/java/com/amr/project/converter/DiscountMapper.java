package com.amr.project.converter;


import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DiscountMapper {

    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    Discount toDiscount(DiscountDTO discountDTO);

    DiscountDTO toDiscountDTO(Discount discount);
}
