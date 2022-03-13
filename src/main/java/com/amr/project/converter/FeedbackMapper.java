package com.amr.project.converter;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Address;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FeedbackMapper {
    FeedbackDTO toDTO(Feedback feedback);
    Feedback toEntity(FeedbackDTO feedbackDTO);
}
