package com.amr.project.converter;

import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    OrderDTO toOrderDto(Order order);
    Order toOrder(OrderDTO orderDto);
}
