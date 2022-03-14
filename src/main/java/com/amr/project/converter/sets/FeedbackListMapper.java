package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.FeedbackMapper;
import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = FeedbackMapper.class)
public interface FeedbackListMapper {

    FeedbackListMapper INSTANCE = Mappers.getMapper(FeedbackListMapper.class);

    List<FeedbackDTO> toDTOList(List<Feedback> feedbacks);

    List<Feedback> toEntityList(List<FeedbackDTO> feedbackDTOS);
}
