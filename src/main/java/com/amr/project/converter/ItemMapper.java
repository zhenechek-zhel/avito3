package com.amr.project.converter;

import com.amr.project.converter.sets.FavoriteSetMapper;
import com.amr.project.converter.sets.ImageSetMapper;
import com.amr.project.converter.sets.OrderSetMapper;
import com.amr.project.converter.sets.ReviewSetMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import com.amr.project.service.abstracts.ItemService;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, ImageSetMapper.class, ReviewSetMapper.class,
        FavoriteSetMapper.class, OrderSetMapper.class, ShopMapper.class})
public interface ItemMapper {
    ItemDTO toDTO(Item item);
    Item toEntity(ItemDTO itemDTO);
}
