package com.amr.project.converter.sets;

import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface ShopSetMapper {
    Set<ShopDTO> toDTOSet(Set<Shop> shops);
    Set<Shop> toEntitySet(Set<ShopDTO> shopDTOS);
}
