package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.CouponMapper;
import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = CouponMapper.class)
public interface CouponSetMapper {

    CouponSetMapper INSTANCE = Mappers.getMapper(CouponSetMapper.class);

    Set<CouponDTO> toDTOSet(Set<Coupon> coupons);

    Set<Coupon> toEntitySet(Set<CouponDTO> couponDTO);
}
