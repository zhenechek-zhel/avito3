package com.amr.project.converter.mappers;

import ch.qos.logback.core.status.StatusManager;
import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {UserMapper.class, ItemSetMapper.class, AddressMapper.class, StatusManager.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    // ToDo ENUM Status status добавить в мэппинг
    OrderDTO toDto(Order order);

    Order toEntity(OrderDTO orderDto);
}

