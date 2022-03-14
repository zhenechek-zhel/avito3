package com.amr.project.converter.mappers;

import com.amr.project.converter.lists.*;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CountryMapper.class, CouponListMapper.class, CouponListMapper.class, ImageMapper.class,
        UserMapper.class, CartItemMapper.class, CouponListMapper.class, CouponListMapper.class, CouponListMapper.class,
        AddressMapper.class, CouponListMapper.class})
public interface ShopMapper {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    ShopDTO toDTO(Shop shop);
    Shop toEntity(ShopDTO shopDto);
}
