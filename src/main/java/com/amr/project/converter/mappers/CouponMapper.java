package com.amr.project.converter.mappers;

import com.amr.project.model.dto.CouponDTO;
import com.amr.project.model.entity.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface CouponMapper {

    CouponDTO toDTO(Coupon coupon);

    Coupon toEntity(CouponDTO couponDTO);

    List<CouponDTO> toDTOList(List<Coupon> coupons);

    List<Coupon> toEntityList(List<CouponDTO> couponDTO);
}
