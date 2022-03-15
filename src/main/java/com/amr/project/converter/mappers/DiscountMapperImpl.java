package com.amr.project.converter.mappers;

import com.amr.project.model.dto.DiscountDTO;
import com.amr.project.model.entity.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiscountMapperImpl implements DiscountMapper {

    private final DiscountMapper discountMapper;

    @Autowired
    public DiscountMapperImpl(DiscountMapper discountMapper) {
        this.discountMapper = discountMapper;
    }

    @Override
    public DiscountDTO toDTO(Discount discount) {
        return discountMapper.toDTO(discount);
    }

    @Override
    public Discount toEntity(DiscountDTO discountDTO) {
        return discountMapper.toEntity(discountDTO);
    }

    @Override
    public List<DiscountDTO> toDTOList(List<Discount> discounts) {
        if (discounts == null) return null;
        List<DiscountDTO> list = new ArrayList<>(discounts.size());
        for (Discount discount : discounts) {
            list.add(discountMapper.toDTO(discount));
        }
        return list;
    }

    @Override
    public List<Discount> toEntityList(List<DiscountDTO> discountDTOS) {
        if (discountDTOS == null) return null;
        List<Discount> list = new ArrayList<>(discountDTOS.size());
        for (DiscountDTO discountDTO : discountDTOS) {
            list.add(discountMapper.toEntity(discountDTO));
        }
        return list;
    }
}
