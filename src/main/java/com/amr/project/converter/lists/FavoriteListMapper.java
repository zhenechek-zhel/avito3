package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.FavoriteMapper;
import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = FavoriteMapper.class)
public interface FavoriteListMapper {

    FavoriteListMapper INSTANCE = Mappers.getMapper(FavoriteListMapper.class);

    List<Favorite> toEntityList(List<FavoriteDTO> dtos);

    List<FavoriteDTO> toDTOList(List<Favorite> entities);
}
