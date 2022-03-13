package com.amr.project.converter.sets;

import com.amr.project.converter.FavoriteMapper;
import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = FavoriteMapper.class)
public interface FavoriteSetMapper {

    FavoriteSetMapper INSTANCE = Mappers.getMapper(FavoriteSetMapper.class);

    Set<Favorite> toEntitySet(Set<FavoriteDTO> dtos);
    Set<FavoriteDTO> toDTOSet(Set<Favorite> entities);
}
