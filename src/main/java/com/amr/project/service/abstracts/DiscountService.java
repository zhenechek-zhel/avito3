package com.amr.project.service.abstracts;

import com.amr.project.model.dto.DiscountDto;

import java.util.List;

public interface DiscountService {
    List<DiscountDto> getAllDiscounts();

    DiscountDto getDiscountById(Long id);

    void saveDiscount(DiscountDto discountDTO);

    void updateDiscount(DiscountDto discountDTO);

    void deleteDiscount(Long id);
}
