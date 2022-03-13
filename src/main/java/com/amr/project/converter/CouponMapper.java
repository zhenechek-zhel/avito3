package com.amr.project.converter;

import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CouponMapper {

    CouponMapper INSTANCE = Mappers.getMapper(CouponMapper.class);

    Coupon toCoupon(CouponDTO couponDTO);

    CouponDTO toCouponDto(Coupon coupon);
}
