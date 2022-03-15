package com.amr.project.service.impl;

import com.amr.project.converter.mappers.OrderMapper;
import com.amr.project.dao.OrderRepository;
import com.amr.project.model.dto.OrderDto;
import com.amr.project.model.entity.Order;
import com.amr.project.service.abstracts.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDto> getAllOrders() {
        return orderMapper.toDTOList(orderRepository.findAll());
    }

    @Override
    public OrderDto getOrderById(Long id) {
        return orderMapper.toDto(orderRepository.getById(id));
    }

    @Override
    public void saveOrder(OrderDto orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void updateOrder(OrderDto orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
