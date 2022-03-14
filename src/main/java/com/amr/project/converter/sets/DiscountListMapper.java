package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.DiscountMapper;
import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = DiscountMapper.class)
public interface DiscountListMapper {

    DiscountListMapper INSTANCE = Mappers.getMapper(DiscountListMapper.class);

    List<DiscountDTO> toDTOList(List<Discount> discounts);

    List<Discount> toEntityList(List<DiscountDTO> discountDTOS);
}
