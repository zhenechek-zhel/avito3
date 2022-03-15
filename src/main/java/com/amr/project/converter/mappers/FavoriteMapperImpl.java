package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FavoriteMapperImpl implements FavoriteMapper {

    private final FavoriteMapper favoriteMapper;

    @Autowired
    public FavoriteMapperImpl(FavoriteMapper favoriteMapper) {
        this.favoriteMapper = favoriteMapper;
    }

    @Override
    public FavoriteDTO toDTO(Favorite favorite) {
        return favoriteMapper.toDTO(favorite);
    }

    @Override
    public Favorite toEntity(FavoriteDTO favoriteDto) {
        return favoriteMapper.toEntity(favoriteDto);
    }

    @Override
    public List<Favorite> toEntityList(List<FavoriteDTO> dtos) {
        if (dtos == null) return null;
        List<Favorite> list = new ArrayList<>(dtos.size());
        for (FavoriteDTO favorite : dtos) {
            list.add(favoriteMapper.toEntity(favorite));
        }
        return list;
    }

    @Override
    public List<FavoriteDTO> toDTOList(List<Favorite> entities) {
        if (entities == null) return null;
        List<FavoriteDTO> list = new ArrayList<>(entities.size());
        for (Favorite favorite : entities) {
            list.add(favoriteMapper.toDTO(favorite));
        }
        return list;
    }
}
