package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewRepository {
    List<ReviewDTO> getAllReview();

    ReviewDTO getReviewById(Long id);

    void saveReview(ReviewDTO reviewDTO);

    void updateReview(ReviewDTO reviewDTO);

    void deleteReview(Long id);
}
