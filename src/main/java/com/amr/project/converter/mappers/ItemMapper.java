package com.amr.project.converter.mappers;

import com.amr.project.converter.sets.FavoriteSetMapper;
import com.amr.project.converter.sets.ImageSetMapper;
import com.amr.project.converter.sets.OrderSetMapper;
import com.amr.project.converter.sets.ReviewSetMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CategoryMapper.class, ImageSetMapper.class, ReviewSetMapper.class,
        FavoriteSetMapper.class, OrderSetMapper.class, ShopMapper.class})
public interface ItemMapper {

    ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    ItemDTO toDTO(Item item);

    Item toEntity(ItemDTO itemDTO);
}
