package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CouponDTO;

import java.util.List;

public interface CouponService {
    List<CouponDTO> getAllCoupons();

    CouponDTO getCouponById(Long id);

    void saveCoupon(CouponDTO couponDTO);

    void updateCoupon(CouponDTO couponDTO);

    void deleteCoupon(Long id);
}
