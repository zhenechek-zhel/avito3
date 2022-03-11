package com.amr.project.service.impl;

import com.amr.project.dao.abstracts.ShopRepository;
import com.amr.project.model.dto.ShopDto;
import com.amr.project.service.abstracts.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    @Autowired
    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public ShopDto createShop(ShopDto shopDto) {
        return null;
    }
}
