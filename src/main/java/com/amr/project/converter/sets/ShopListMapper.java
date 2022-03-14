package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ShopMapper;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = ShopMapper.class)
public interface ShopListMapper {

    ShopListMapper INSTANCE = Mappers.getMapper(ShopListMapper.class);


    List<ShopDTO> toDTOList(List<Shop> shops);

    List<Shop> toEntityList(List<ShopDTO> shopDTOS);
}
