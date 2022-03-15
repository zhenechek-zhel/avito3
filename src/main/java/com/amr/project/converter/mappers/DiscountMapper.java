package com.amr.project.converter.mappers;

import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface DiscountMapper {

    DiscountDTO toDTO(Discount discount);

    Discount toEntity(DiscountDTO discountDTO);

    List<DiscountDTO> toDTOList(List<Discount> discounts);

    List<Discount> toEntityList(List<DiscountDTO> discountDTOS);
}
