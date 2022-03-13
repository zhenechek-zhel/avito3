package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.DiscountMapper;
import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = DiscountMapper.class)
public interface DiscountSetMapper {

    DiscountSetMapper INSTANCE = Mappers.getMapper(DiscountSetMapper.class);

    Set<DiscountDTO> toDTOSet(Set<Discount> discounts);

    Set<Discount> toEntitySet(Set<DiscountDTO> discountDTOS);
}
