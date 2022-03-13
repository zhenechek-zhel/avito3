package com.amr.project.converter.sets;

import com.amr.project.converter.DiscountMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Discount;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = DiscountMapper.class)
public interface DiscountSetMapper {

    DiscountSetMapper INSTANCE = Mappers.getMapper(DiscountSetMapper.class);

    Set<DiscountDTO> toDTOSet(Set<Discount> discounts);
    Set<Discount> toEntitySet(Set<DiscountDTO> discountDTOS);
}
