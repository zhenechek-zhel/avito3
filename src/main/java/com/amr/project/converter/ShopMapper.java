package com.amr.project.converter;

import com.amr.project.converter.sets.*;
import com.amr.project.model.dto.*;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ItemSetMapper.class, ReviewSetMapper.class,ImageMapper.class,
        UserMapper.class, CartItemMapper.class, FeedbackSetMapper.class, DiscountSetMapper.class, FavoriteSetMapper.class,
AddressMapper.class,CouponSetMapper.class})
public interface ShopMapper {
    ShopDTO toShopDto(Shop shop);
    Shop toShop(ShopDTO shopDto);
}
