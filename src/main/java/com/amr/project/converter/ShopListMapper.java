package com.amr.project.converter;

import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ShopMapper.class)
public interface ShopListMapper {
    List<ShopDTO> toDTOList(List<Shop> shop);
    List<Shop> toEntityList(List<ShopDTO> shop);
}
