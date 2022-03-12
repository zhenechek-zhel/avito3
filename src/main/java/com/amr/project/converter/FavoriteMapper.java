package com.amr.project.converter;

import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FavoriteMapper {

    FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);

    FavoriteDto toFavoriteDto(Favorite favorite);

    Favorite toFavorite(FavoriteDto favoriteDto);
}
