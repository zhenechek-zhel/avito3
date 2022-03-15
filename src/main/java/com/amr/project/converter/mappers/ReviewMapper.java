package com.amr.project.converter.mappers;

import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ShopMapper.class, ItemMapper.class})
public interface ReviewMapper {

    ReviewDTO toDTO(Review review);

    Review toEntity(ReviewDTO reviewDto);

    List<Review> toEntityList(List<ReviewDTO> dtos);

    List<ReviewDTO> toDTOList(List<Review> entities);
}
