package com.amr.project.converter;

import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ShopMapper.class, UserMapper.class})
public interface FeedbackMapper {
    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);
    FeedbackDTO toDTO(Feedback feedback);
    Feedback toEntity(FeedbackDTO feedbackDTO);
}
