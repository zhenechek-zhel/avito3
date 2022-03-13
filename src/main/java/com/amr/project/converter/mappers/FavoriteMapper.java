package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ShopMapper.class, UserMapper.class, ItemMapper.class})
public interface FavoriteMapper {
    FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);

    FavoriteDTO toDTO(Favorite favorite);

    Favorite toEntity(FavoriteDTO favoriteDto);
}
