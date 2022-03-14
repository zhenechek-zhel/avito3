package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ShopMapper;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = ShopMapper.class)
public interface ShopSetMapper {

    ShopSetMapper INSTANCE = Mappers.getMapper(ShopSetMapper.class);


    Set<ShopDTO> toDTOSet(Set<Shop> shops);

    Set<Shop> toEntitySet(Set<ShopDTO> shopDTOS);
}
