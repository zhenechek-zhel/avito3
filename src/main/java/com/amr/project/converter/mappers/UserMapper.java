package com.amr.project.converter.mappers;

import com.amr.project.converter.sets.*;
import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CouponSetMapper.class, CartItemSetMapper.class, OrderSetMapper.class,
        ReviewSetMapper.class, ShopSetMapper.class, DiscountSetMapper.class, MessageSetMapper.class, ChatSetMapper.class,
        FeedbackSetMapper.class, UserInfoMapper.class, FavoriteMapper.class, AddressMapper.class, ImageSetMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);
}

