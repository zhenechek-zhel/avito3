package com.amr.project.converter;

import com.amr.project.converter.sets.*;
import com.amr.project.model.dto.*;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {CouponSetMapper.class, CartItemSetMapper.class, OrderSetMapper.class,
        ReviewSetMapper.class, ShopSetMapper.class, DiscountSetMapper.class, MessageSetMapper.class,ChatSetMapper.class,
        FeedbackSetMapper.class, UserInfoMapper.class, FavoriteMapper.class,AddressMapper.class, ImageSetMapper.class})
public interface UserMapper {
    //ToDo прописать Roles Mapper (ENUM)
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}

