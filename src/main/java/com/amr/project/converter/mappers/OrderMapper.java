package com.amr.project.converter.mappers;

import ch.qos.logback.core.status.StatusManager;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, ItemMapper.class, AddressMapper.class, StatusManager.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {

    OrderDTO toDto(Order order);

    Order toEntity(OrderDTO orderDto);

    List<Order> toEntityList(List<OrderDTO> dtos);

    List<OrderDTO> toDTOList(List<Order> entities);

}

