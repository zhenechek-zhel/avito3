package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ReviewMapper;
import com.amr.project.dao.ReviewRepository;
import com.amr.project.model.dto.ReviewDto;
import com.amr.project.model.entity.Review;
import com.amr.project.service.abstracts.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    @Override
    public List<ReviewDto> getAllReview() {
        return reviewMapper.toDTOList(reviewRepository.findAll());
    }

    @Override
    public ReviewDto getReviewById(Long id) {
        return reviewMapper.toDTO(reviewRepository.getById(id));
    }

    @Override
    public void saveReview(ReviewDto reviewDTO) {
        Review review = reviewMapper.toEntity(reviewDTO);
        reviewRepository.saveAndFlush(review);
    }

    @Override
    public void updateReview(ReviewDto reviewDTO) {
        Review review = reviewMapper.toEntity(reviewDTO);
        reviewRepository.saveAndFlush(review);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
