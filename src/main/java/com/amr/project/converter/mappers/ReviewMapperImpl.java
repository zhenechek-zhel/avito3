package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReviewMapperImpl implements ReviewMapper {

    private final ReviewMapper reviewMapper;

    @Autowired
    public ReviewMapperImpl(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    @Override
    public ReviewDTO toDTO(Review review) {
        return reviewMapper.toDTO(review);
    }

    @Override
    public Review toEntity(ReviewDTO reviewDto) {
        return reviewMapper.toEntity(reviewDto);
    }

    @Override
    public List<Review> toEntityList(List<ReviewDTO> dtos) {
        if (dtos == null) return null;
        List<Review> list = new ArrayList<>(dtos.size());
        for (ReviewDTO reviewDto : dtos) {
            list.add(reviewMapper.toEntity(reviewDto));
        }
        return list;
    }

    @Override
    public List<ReviewDTO> toDTOList(List<Review> entities) {
        if (entities == null) return null;
        List<ReviewDTO> list = new ArrayList<>(entities.size());
        for (Review review : entities) {
            list.add(reviewMapper.toDTO(review));
        }
        return list;
    }
}
