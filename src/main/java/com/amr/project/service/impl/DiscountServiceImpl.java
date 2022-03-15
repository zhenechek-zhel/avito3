package com.amr.project.service.impl;

import com.amr.project.converter.mappers.DiscountMapper;
import com.amr.project.dao.abstracts.DiscountRepository;
import com.amr.project.model.dto.DiscountDTO;
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
    public List<DiscountDTO> getAllDiscounts() {
        List<Discount> discounts = discountRepository.findAll();
        return discountMapper.toDTOList(discounts);
    }

    @Override
    public DiscountDTO getDiscountById(Long id) {
        Discount discount = discountRepository.getById(id);
        return discountMapper.toDTO(discount);
    }

    @Override
    public void saveDiscount(DiscountDTO discountDTO) {
        Discount discount = discountMapper.toEntity(discountDTO);
        discountRepository.saveAndFlush(discount);
    }

    @Override
    public void updateDiscount(DiscountDTO discountDTO) {
        Discount discount = discountMapper.toEntity(discountDTO);
        discountRepository.saveAndFlush(discount);
    }

    @Override
    public void deleteDiscount(Long id) {
        discountRepository.deleteById(id);
    }
}
