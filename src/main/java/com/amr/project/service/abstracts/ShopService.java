package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ShopDto;
import com.amr.project.model.entity.Shop;

import java.util.List;
import java.util.Optional;


public interface ShopService {
    void createShop(ShopDto shopDto);

    Optional<ShopDto> loadShop(Long id);

    List<ShopDto> getShops();

    Optional<ShopDto> updateShop(long id, ShopDto shopDto);
}
