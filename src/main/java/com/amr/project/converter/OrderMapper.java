package com.amr.project.converter;

import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ItemSetMapper.class,AddressMapper.class})
public interface OrderMapper {
    // ToDo ENUM Status status добавить в мэппинг
    OrderDTO toOrderDto(Order order);
    Order toOrder(OrderDTO orderDto);
}
