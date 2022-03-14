package com.amr.project.converter.sets;

import com.amr.project.converter.mappers.OrderMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(uses = OrderMapper.class)
public interface OrderSetMapper {

    OrderSetMapper INSTANCE = Mappers.getMapper(OrderSetMapper.class);


    Set<Order> toEntitySet(Set<OrderDTO> dtos);

    Set<OrderDTO> toDTOSet(Set<Order> entities);

}
