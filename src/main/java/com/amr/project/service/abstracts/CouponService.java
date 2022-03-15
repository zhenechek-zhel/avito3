package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CouponDTO;

import java.util.List;

public interface CouponService {
    List<CouponDTO> getAllItems();

    CouponDTO getItemById(Long id);

    void saveItem(CouponDTO couponDTO);

    void updateItem(CouponDTO couponDTO);

    void deleteItem(Long id);
}
