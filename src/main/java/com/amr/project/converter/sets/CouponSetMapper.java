package com.amr.project.converter.sets;

import com.amr.project.converter.CountryMapper;
import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = CountryMapper.class)
public interface CouponSetMapper {

    Set<CouponDTO> toDTOSet(Set<Coupon> coupons);
    Set<Coupon> toEntitySet(Set<CouponDTO> couponDTOS);
}