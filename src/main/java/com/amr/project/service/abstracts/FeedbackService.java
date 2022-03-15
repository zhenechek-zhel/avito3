package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FeedbackDTO;

import java.util.List;

public interface FeedbackService {
    List<FeedbackDTO> getAllFeedbacks();

    FeedbackDTO getFeedbackById(Long id);

    void saveFeedback(FeedbackDTO feedbackDTO);

    void updateFeedback(FeedbackDTO feedbackDTO);

    void deleteFeedback(Long id);
}
