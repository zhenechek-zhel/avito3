package com.amr.project.converter.sets;

import com.amr.project.converter.ItemMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Item;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface ItemSetMapper {
    Set<ItemDTO> toDTOSet(Set<Item> item);
    Set<Item> toEntitySet(Set<ItemDTO> item);
}
