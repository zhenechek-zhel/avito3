package com.amr.project.converter;

import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ShopMapper {
    ShopDTO toShopDto(Shop shop);
    Shop toShop(ShopDTO shopDto);
}
