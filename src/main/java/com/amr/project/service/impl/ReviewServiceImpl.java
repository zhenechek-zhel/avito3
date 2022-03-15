package com.amr.project.service.impl;

import com.amr.project.converter.mappers.ReviewMapper;
import com.amr.project.dao.ReviewRepository;
import com.amr.project.dao.UserRepository;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Message;
import com.amr.project.model.entity.Review;
import com.amr.project.model.entity.User;
import com.amr.project.service.abstracts.ReviewService;
import com.amr.project.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    @Override
    public List<ReviewDTO> getAllReview() {
        return reviewMapper.toDTOList(reviewRepository.findAll());
    }

    @Override
    public ReviewDTO getReviewById(Long id) {
        return reviewMapper.toDTO(reviewRepository.getById(id));
    }

    @Override
    public void saveReview(ReviewDTO reviewDTO) {
        Review review = reviewMapper.toEntity(reviewDTO);
        reviewRepository.saveAndFlush(review);
    }

    @Override
    public void updateReview(ReviewDTO reviewDTO) {
        Review review = reviewMapper.toEntity(reviewDTO);
        reviewRepository.saveAndFlush(review);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
