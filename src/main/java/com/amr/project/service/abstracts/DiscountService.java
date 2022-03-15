package com.amr.project.service.abstracts;

import com.amr.project.model.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {
    List<DiscountDTO> getAllItems();

    DiscountDTO getItemById(Long id);

    void saveItem(DiscountDTO discountDTO);

    void updateItem(DiscountDTO discountDTO);

    void deleteItem(Long id);
}
