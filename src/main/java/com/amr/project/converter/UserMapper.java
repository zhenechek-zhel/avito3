package com.amr.project.converter;

import com.amr.project.model.dto.*;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {CouponMapper.class, CartItemMapper.class, OrderMapper.class,
        ReviewMapper.class,ShopMapper.class,DiscountMapper.class,MessageMapper.class,ChatMapper.class,
        FeedbackMapper.class, UserInfoMapper.class, FavoriteMapper.class,AddressMapper.class,ImageMapper.class})
public interface UserMapper {
    //ToDo Enum ROLES надо прописать сверху как-то
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}

