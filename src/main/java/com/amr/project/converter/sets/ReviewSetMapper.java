package com.amr.project.converter.sets;

import com.amr.project.converter.ReviewMapper;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses = ReviewMapper.class)
public interface ReviewSetMapper {
    Set<Review> toEntitySet(Set<ReviewDTO> dtos);
    Set<ReviewDTO> toDTOSet(Set<Review> entities);
}
