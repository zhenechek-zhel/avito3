package com.amr.project.converter;

import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CouponMapper {
    CouponDTO toDTO(Coupon coupon);
    Coupon toEntity(CouponDTO couponDTO);
}