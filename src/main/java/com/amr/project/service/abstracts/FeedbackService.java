package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FeedbackDto;

import java.util.List;

public interface FeedbackService {
    List<FeedbackDto> getAllFeedbacks();

    FeedbackDto getFeedbackById(Long id);

    void saveFeedback(FeedbackDto feedbackDTO);

    void updateFeedback(FeedbackDto feedbackDTO);

    void deleteFeedback(Long id);
}
