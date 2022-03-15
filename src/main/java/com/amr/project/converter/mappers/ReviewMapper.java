package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ReviewDto;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ShopMapper.class, ItemMapper.class})
public interface ReviewMapper {

    ReviewDto toDTO(Review review);

    Review toEntity(ReviewDto reviewDto);

    List<Review> toEntityList(List<ReviewDto> dtos);

    List<ReviewDto> toDTOList(List<Review> entities);
}
