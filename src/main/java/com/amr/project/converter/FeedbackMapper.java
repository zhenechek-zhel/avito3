package com.amr.project.converter;

import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FeedbackMapper {

    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);

    Feedback toFeedback(FeedbackDTO feedbackDTO);

    FeedbackDTO toFeedbackDTO(Feedback feedback);
}
