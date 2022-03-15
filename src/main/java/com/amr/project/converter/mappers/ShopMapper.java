package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CountryMapper.class, ImageMapper.class,
        UserMapper.class, CartItemMapper.class, CouponMapper.class,
        AddressMapper.class})
public interface ShopMapper {

    ShopDTO toDTO(Shop shop);

    Shop toEntity(ShopDTO shopDto);

    List<ShopDTO> toDTOList(List<Shop> shops);

    List<Shop> toEntityList(List<ShopDTO> shopDTOS);
}
