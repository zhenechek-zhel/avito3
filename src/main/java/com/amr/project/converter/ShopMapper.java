package com.amr.project.converter;

import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShopMapper {

    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    ShopDto toShopDto(Shop shop);

    Shop toShop(ShopDto shopDto);
}
