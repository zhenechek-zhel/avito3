package com.amr.project.converter.sets;

import com.amr.project.converter.FeedbackMapper;
import com.amr.project.converter.ShopMapper;
import com.amr.project.model.dto.FeedbackDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.entity.Feedback;
import com.amr.project.model.entity.Shop;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = FeedbackMapper.class)
public interface FeedbackSetMapper {
    Set<FeedbackDTO> toDTOSet(Set<Feedback> feedbacks);
    Set<Feedback> toEntitySet(Set<FeedbackDTO> feedbackDTOS);
}
