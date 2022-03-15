package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FavoriteDto;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDto> getAllFavorites();

    FavoriteDto getFavoriteById(Long id);

    void saveFavorite(FavoriteDto favoriteDTO);

    void updateFavorite(FavoriteDto favoriteDTO);

    void deleteFavorite(Long id);
}
