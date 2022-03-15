package com.amr.project.service.impl;

import com.amr.project.converter.mappers.CouponMapper;
import com.amr.project.dao.CouponRepository;
import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import com.amr.project.service.abstracts.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;
    private final CouponMapper couponMapper;

    @Override
    public List<CouponDTO> getAllCoupons() {
        List<Coupon> coupons = couponRepository.findAll();
        return couponMapper.toDTOList(coupons);
    }

    @Override
    public CouponDTO getCouponById(Long id) {
        Coupon coupon = couponRepository.getById(id);
        return couponMapper.toDTO(coupon);
    }

    @Override
    public void saveCoupon(CouponDTO couponDTO) {
        Coupon coupon = couponMapper.toEntity(couponDTO);
        couponRepository.saveAndFlush(coupon);
    }

    @Override
    public void updateCoupon(CouponDTO couponDTO) {
        Coupon coupon = couponMapper.toEntity(couponDTO);
        couponRepository.saveAndFlush(coupon);
    }

    @Override
    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }
}
