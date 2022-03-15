package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopMapperImpl implements ShopMapper {

    private final ShopMapper shopMapper;

    @Autowired
    public ShopMapperImpl(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public ShopDTO toDTO(Shop shop) {
        return shopMapper.toDTO(shop);
    }

    @Override
    public Shop toEntity(ShopDTO shopDto) {
        return shopMapper.toEntity(shopDto);
    }

    @Override
    public List<ShopDTO> toDTOList(List<Shop> shops) {
        if (shops == null) return null;
        List<ShopDTO> list = new ArrayList<>(shops.size());
        for (Shop shop : shops) {
            list.add(shopMapper.toDTO(shop));
        }
        return list;
    }

    @Override
    public List<Shop> toEntityList(List<ShopDTO> shopDTOS) {
        if (shopDTOS == null) return null;
        List<Shop> list = new ArrayList<>(shopDTOS.size());
        for (ShopDTO shopDTO : shopDTOS) {
            list.add(shopMapper.toEntity(shopDTO));
        }
        return list;
    }
}
