package com.amr.project.service.abstracts;

import com.amr.project.model.dto.FeedbackDTO;

import java.util.List;

public interface FeedbackService {
    List<FeedbackDTO> getAllItems();

    FeedbackDTO getItemById(Long id);

    void saveItem(FeedbackDTO feedbackDTO);

    void updateItem(FeedbackDTO feedbackDTO);

    void deleteItem(Long id);
}
