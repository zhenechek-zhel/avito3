package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    List<ReviewDTO> getAllReview();

    ReviewDTO getReviewById(Long id);

    void saveReview(ReviewDTO reviewDTO);

    void updateReview(ReviewDTO reviewDTO);

    void deleteReview(Long id);
}
