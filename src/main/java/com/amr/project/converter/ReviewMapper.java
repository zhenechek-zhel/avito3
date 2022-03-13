package com.amr.project.converter;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.ReviewDTO;
import com.amr.project.model.dto.ShopDTO;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ShopMapper.class,ItemMapper.class})
public interface ReviewMapper {
    ReviewDTO toReviewDto(Review review);
    Review toReview(ReviewDTO reviewDto);
}
