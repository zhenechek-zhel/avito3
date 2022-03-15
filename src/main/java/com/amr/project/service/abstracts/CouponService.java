package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CouponDto;

import java.util.List;

public interface CouponService {
    List<CouponDto> getAllCoupons();

    CouponDto getCouponById(Long id);

    void saveCoupon(CouponDto couponDTO);

    void updateCoupon(CouponDto couponDTO);

    void deleteCoupon(Long id);
}
