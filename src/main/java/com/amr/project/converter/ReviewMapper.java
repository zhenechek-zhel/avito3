package com.amr.project.converter;

import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper {

    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    ReviewDto toReviewDto(Review review);

    Review toReview(ReviewDto reviewDto);
}
