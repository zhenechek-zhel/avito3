package com.amr.project.service.abstracts;

import com.amr.project.model.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    List<DiscountDTO> getAllDiscounts();

    DiscountDTO getDiscountById(Long id);

    void saveDiscount(DiscountDTO discountDTO);

    void updateDiscount(DiscountDTO discountDTO);

    void deleteDiscount(Long id);
}
