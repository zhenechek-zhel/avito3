package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FavoriteDTO;

import java.util.List;

public interface FavoriteService {
    List<FavoriteDTO> getAllItems();

    FavoriteDTO getItemById(Long id);

    void saveItem(FavoriteDTO favoriteDTO);

    void updateItem(FavoriteDTO favoriteDTO);

    void deleteItem(Long id);
}
