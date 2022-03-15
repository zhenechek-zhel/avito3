package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ShopMapper.class, UserMapper.class, ItemMapper.class})
public interface FavoriteMapper { ;

    FavoriteDTO toDTO(Favorite favorite);

    Favorite toEntity(FavoriteDTO favoriteDto);

    List<Favorite> toEntityList(List<FavoriteDTO> dtos);

    List<FavoriteDTO> toDTOList(List<Favorite> entities);
}
