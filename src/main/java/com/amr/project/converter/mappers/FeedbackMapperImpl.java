package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedbackMapperImpl implements FeedbackMapper {

    private final FeedbackMapper feedbackMapper;

    @Autowired
    public FeedbackMapperImpl(FeedbackMapper feedbackMapper) {
        this.feedbackMapper = feedbackMapper;
    }

    @Override
    public FeedbackDTO toDTO(Feedback feedback) {
        return feedbackMapper.toDTO(feedback);
    }

    @Override
    public Feedback toEntity(FeedbackDTO feedbackDTO) {
        return feedbackMapper.toEntity(feedbackDTO);
    }

    @Override
    public List<FeedbackDTO> toDTOList(List<Feedback> feedbacks) {
        if (feedbacks == null) return null;
        List<FeedbackDTO> list = new ArrayList<>(feedbacks.size());
        for (Feedback feedback : feedbacks) {
            list.add(feedbackMapper.toDTO(feedback));
        }
        return list;
    }

    @Override
    public List<Feedback> toEntityList(List<FeedbackDTO> feedbackDTOS) {
        if (feedbackDTOS == null) return null;
        List<Feedback> list = new ArrayList<>(feedbackDTOS.size());
        for (FeedbackDTO feedbackDTO : feedbackDTOS) {
            list.add(feedbackMapper.toEntity(feedbackDTO));
        }
        return list;
    }
}
