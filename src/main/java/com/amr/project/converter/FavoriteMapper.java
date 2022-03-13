package com.amr.project.converter;

import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {FavoriteMapper.class, ShopMapper.class, UserMapper.class, ItemMapper.class})
public interface FavoriteMapper {

    FavoriteDTO toFavoriteDto(Favorite favorite);
    Favorite toFavorite(FavoriteDTO favoriteDto);
}
