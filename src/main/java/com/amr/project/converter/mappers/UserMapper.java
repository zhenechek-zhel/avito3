package com.amr.project.converter.mappers;

import com.amr.project.model.dto.UserDto;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderMapper.class, FavoriteMapper.class,
        ImageMapper.class, CountryMapper.class, CartItemMapper.class, ShopMapper.class,
        DiscountMapper.class, MessageMapper.class, ChatMapper.class, FeedbackMapper.class,
        ReviewMapper.class, UserInfoMapper.class, FavoriteMapper.class, AddressMapper.class})
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDTO);

    List<UserDto> toDtoList(List<User> users);

    List<User> toEntityList(List<UserDto> userDTOS);

}

