package com.amr.project.converter.lists;

import com.amr.project.converter.mappers.ReviewMapper;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = ReviewMapper.class)
public interface ReviewListMapper {

    ReviewListMapper INSTANCE = Mappers.getMapper(ReviewListMapper.class);


    List<Review> toEntityList(List<ReviewDTO> dtos);

    List<ReviewDTO> toDTOList(List<Review> entities);
}
