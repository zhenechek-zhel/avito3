package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ShopMapper.class, UserMapper.class})
public interface FeedbackMapper {

    FeedbackDTO toDTO(Feedback feedback);

    Feedback toEntity(FeedbackDTO feedbackDTO);

    List<FeedbackDTO> toDTOList(List<Feedback> feedbacks);

    List<Feedback> toEntityList(List<FeedbackDTO> feedbackDTOS);
}
