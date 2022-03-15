package com.amr.project.service.impl;

import com.amr.project.converter.mappers.OrderMapper;
import com.amr.project.dao.OrderRepository;
import com.amr.project.dao.UserRepository;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Message;
import com.amr.project.model.entity.Order;
import com.amr.project.model.entity.User;
import com.amr.project.service.abstracts.OrderService;
import com.amr.project.service.abstracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderMapper.toDTOList(orderRepository.findAll());
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return orderMapper.toDto(orderRepository.getById(id));
    }

    @Override
    public void saveOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void updateOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toEntity(orderDTO);
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
