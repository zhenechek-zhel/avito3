package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class CouponMapperImpl implements CouponMapper {

    private final CouponMapper couponMapper;

    public CouponMapperImpl(CouponMapper couponMapper) {
        this.couponMapper = couponMapper;
    }

    @Override
    public CouponDTO toDTO(Coupon coupon) {
        return couponMapper.toDTO(coupon);
    }

    @Override
    public Coupon toEntity(CouponDTO couponDTO) {
        return couponMapper.toEntity(couponDTO);
    }

    @Override
    public List<CouponDTO> toDTOList(List<Coupon> coupons) {
        if (coupons == null) return null;
        List<CouponDTO> list = new ArrayList<>(coupons.size());
        for (Coupon coupon : coupons) {
            list.add(couponMapper.toDTO(coupon));
        }
        return list;
    }

    @Override
    public List<Coupon> toEntityList(List<CouponDTO> couponDTOS) {
        if (couponDTOS == null)return null;
        List<Coupon> list = new ArrayList<>(couponDTOS.size());
        for (CouponDTO couponDTO : couponDTOS) {
            list.add(couponMapper.toEntity(couponDTO));
        }
        return list;
    }
}
