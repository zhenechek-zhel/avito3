package com.amr.project.converter.sets;

import com.amr.project.converter.FavoriteMapper;
import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = FavoriteMapper.class)
public interface FavoriteSetMapper {


    Set<Favorite> toFavoriteSet(Set<FavoriteDTO> favorites);

    Set<FavoriteDTO> toFavoriteDTOSet(Set<Favorite> favoriteDTOS);
}
