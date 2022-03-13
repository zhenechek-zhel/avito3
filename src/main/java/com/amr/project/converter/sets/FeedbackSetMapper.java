package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.FeedbackMapper;
import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = FeedbackMapper.class)
public interface FeedbackSetMapper {

    FeedbackSetMapper INSTANCE = Mappers.getMapper(FeedbackSetMapper.class);

    Set<FeedbackDTO> toDTOSet(Set<Feedback> feedbacks);

    Set<Feedback> toEntitySet(Set<FeedbackDTO> feedbackDTOS);
}
