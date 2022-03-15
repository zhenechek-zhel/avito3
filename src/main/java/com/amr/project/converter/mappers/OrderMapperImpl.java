package com.amr.project.converter.mappers;

import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderMapperImpl implements OrderMapper {

    private final OrderMapper orderMapper;

    @Autowired
    public OrderMapperImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public OrderDTO toDto(Order order) {
        return orderMapper.toDto(order);
    }

    @Override
    public Order toEntity(OrderDTO orderDto) {
        return orderMapper.toEntity(orderDto);
    }

    @Override
    public List<Order> toEntityList(List<OrderDTO> dtos) {
        if (dtos == null) return null;
        List<Order> list = new ArrayList<>(dtos.size());
        for (OrderDTO orderDto : dtos) {
            list.add(orderMapper.toEntity(orderDto));
        }
        return list;
    }

    @Override
    public List<OrderDTO> toDTOList(List<Order> entities) {
        if (entities == null) return null;
        List<OrderDTO> list = new ArrayList<>(entities.size());
        for (Order order : entities) {
            list.add(orderMapper.toDto(order));
        }
        return list;
    }
}
