package com.amr.project.converter.mappers;

import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class, ItemSetMapper.class, AddressMapper.class})
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO toDto(Order order);
    Order toEntity(OrderDTO orderDto);
}

