package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ShopMapper;
import com.amr.project.dao.abstracts.CountryRepository;
import com.amr.project.dao.abstracts.ShopRepository;
import com.amr.project.model.dto.ShopDto;
import com.amr.project.model.entity.Country;
import com.amr.project.model.entity.Shop;
import com.amr.project.restcontroller.ShopController;
import com.amr.project.service.abstracts.ShopService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {


    private final ShopRepository shopRepository;
    private final CountryRepository countryRepository;
    private final ShopMapper shopMapper;
    private static final Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Override
    @Transactional
    public void createShop(ShopDto shopDto) {
        Shop shop = shopMapper.toEntity(shopDto);
        logger.info(shop.toString());
        Country country = shop.getLocation();
        countryRepository.save(country);
        shopRepository.save(shop);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ShopDto> loadShop(Long id) {
        Optional<Shop> shop = shopRepository.findById(id);
        if (shop.isEmpty()) {
            return Optional.empty();
        }
        ShopDto shopDto = shopMapper.toDto(shop.get());
        return Optional.of(shopDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ShopDto> getShops() {
        List<Shop> shopList = shopRepository.findAll();
        return shopMapper.toDtoList(shopList);
    }

    @Override
    public Optional<ShopDto> updateShop(long id, ShopDto shopDto) {
        if (!shopRepository.existsById(id)) {
            return Optional.empty();
        }
        Shop shop = shopRepository.getById(id);
        countryRepository.save(shop.getLocation());
        shopMapper.updateShopFromDto(shopDto, shop);
        shopRepository.save(shop);
        return Optional.of(shopDto);
    }
}
