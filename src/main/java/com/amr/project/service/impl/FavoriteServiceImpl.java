package com.amr.project.service.impl;

import com.amr.project.converter.mappers.FavoriteMapper;
import com.amr.project.dao.abstracts.FavoriteRepository;
import com.amr.project.model.dto.FavoriteDTO;
import com.amr.project.model.entity.Favorite;
import com.amr.project.service.abstracts.FavoriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteRepository favoriteRepository;
    private final FavoriteMapper favoriteMapper;

    @Override
    public List<FavoriteDTO> getAllFavorites() {
        List<Favorite> favorites = favoriteRepository.findAll();
        return favoriteMapper.toDTOList(favorites);
    }

    @Override
    public FavoriteDTO getFavoriteById(Long id) {
        Favorite favorite = favoriteRepository.getById(id);
        return favoriteMapper.toDTO(favorite);
    }

    @Override
    public void saveFavorite(FavoriteDTO favoriteDTO) {
        Favorite favorite = favoriteMapper.toEntity(favoriteDTO);
        favoriteRepository.saveAndFlush(favorite);
    }

    @Override
    public void updateFavorite(FavoriteDTO favoriteDTO) {
        Favorite favorite = favoriteMapper.toEntity(favoriteDTO);
        favoriteRepository.saveAndFlush(favorite);
    }

    @Override
    public void deleteFavorite(Long id) {
        favoriteRepository.deleteById(id);
    }
}
