package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.OrderMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = OrderMapper.class)
public interface OrderListMapper {

    OrderListMapper INSTANCE = Mappers.getMapper(OrderListMapper.class);


    List<Order> toEntityList(List<OrderDTO> dtos);

    List<OrderDTO> toDTOList(List<Order> entities);

}
