package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.CouponMapper;
import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(uses = CouponMapper.class)
public interface CouponListMapper {

    CouponListMapper INSTANCE = Mappers.getMapper(CouponListMapper.class);

    List<CouponDTO> toDTOList(List<Coupon> coupons);

    List<Coupon> toEntityList(Set<CouponDTO> couponDTO);
}
