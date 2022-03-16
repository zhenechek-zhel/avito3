package com.amr.project.service.impl;

import com.amr.project.converter.mappers.DiscountMapper;
import com.amr.project.dao.DiscountRepository;
import com.amr.project.model.dto.DiscountDto;
import com.amr.project.model.entity.Discount;
import com.amr.project.service.abstracts.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscountServiceImpl implements DiscountService {

    private final DiscountRepository discountRepository;
    private final DiscountMapper discountMapper;

    @Override
    public List<DiscountDto> getAllDiscounts() {
        List<Discount> discounts = discountRepository.findAll();
        return discountMapper.toDtoList(discounts);
    }

    @Override
    public DiscountDto getDiscountById(Long id) {
        Discount discount = discountRepository.getById(id);
        return discountMapper.toDto(discount);
    }

    @Override
    public void saveDiscount(DiscountDto discountDTO) {
        Discount discount = discountMapper.toEntity(discountDTO);
        discountRepository.saveAndFlush(discount);
    }

    @Override
    public void updateDiscount(DiscountDto discountDTO) {
        Discount discount = discountMapper.toEntity(discountDTO);
        discountRepository.saveAndFlush(discount);
    }

    @Override
    public void deleteDiscount(Long id) {
        discountRepository.deleteById(id);
    }
}
