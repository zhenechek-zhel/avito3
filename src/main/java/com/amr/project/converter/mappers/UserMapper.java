package com.amr.project.converter.mappers;

import com.amr.project.model.dto.UserDTO;
import com.amr.project.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OrderMapper.class, FavoriteMapper.class,
        ImageMapper.class, CountryMapper.class, CartItemMapper.class, ShopMapper.class,
        DiscountMapper.class, MessageMapper.class, ChatMapper.class, FeedbackMapper.class,
        ReviewMapper.class, UserInfoMapper.class, FavoriteMapper.class, AddressMapper.class})
public interface UserMapper {

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);

    List<UserDTO> toDTOList(List<User> users);

    List<User> toEntityList(List<UserDTO> userDTOS);

}

