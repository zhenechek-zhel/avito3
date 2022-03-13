package com.amr.project.converter;

import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDTO toOrderDto(Order order);
    Order toOrder(OrderDTO orderDto);
}
