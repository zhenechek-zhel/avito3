package com.amr.project.converter;

import com.amr.project.model.dto.AddressDTO;
import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.entity.Address;
import com.amr.project.model.entity.Feedback;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ShopMapper.class, UserMapper.class})
public interface FeedbackMapper {
    FeedbackDTO toDTO(Feedback feedback);
    Feedback toEntity(FeedbackDTO feedbackDTO);
}
