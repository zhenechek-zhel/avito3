package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.ReviewMapper;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring", uses = ReviewMapper.class)
public interface ReviewSetMapper {

    ReviewSetMapper INSTANCE = Mappers.getMapper(ReviewSetMapper.class);


    Set<Review> toEntitySet(Set<ReviewDTO> dtos);

    Set<ReviewDTO> toDTOSet(Set<Review> entities);
}
