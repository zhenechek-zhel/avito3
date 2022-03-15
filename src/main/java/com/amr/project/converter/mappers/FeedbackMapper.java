package com.amr.project.converter.mappers;

import com.amr.project.model.dto.FeedbackDto;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ShopMapper.class, UserMapper.class})
public interface FeedbackMapper {

    FeedbackDto toDto(Feedback feedback);

    Feedback toEntity(FeedbackDto feedbackDto);

    List<FeedbackDto> toDTOList(List<Feedback> feedbacks);

    List<Feedback> toEntityList(List<FeedbackDto> feedbackDtos);
}
