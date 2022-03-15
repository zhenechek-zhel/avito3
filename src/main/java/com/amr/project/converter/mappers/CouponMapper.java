package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CouponDto;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface CouponMapper {

    CouponDto toDto(Coupon coupon);

    Coupon toEntity(CouponDto couponDto);

    List<CouponDto> toDTOList(List<Coupon> coupons);

    List<Coupon> toEntityList(List<CouponDto> couponDto);
}
