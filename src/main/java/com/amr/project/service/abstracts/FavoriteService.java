package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> getAllFavorites();

    FavoriteDTO getFavoriteById(Long id);

    void saveFavorite(FavoriteDTO favoriteDTO);

    void updateFavorite(FavoriteDTO favoriteDTO);

    void deleteFavorite(Long id);
}
