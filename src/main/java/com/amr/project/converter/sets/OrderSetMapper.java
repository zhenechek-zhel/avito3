package com.amr.project.converter.sets;

import com.amr.project.converter.OrderMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring", uses = OrderMapper.class)
public interface OrderSetMapper {

    Set<Order> toEntitySet(Set<OrderDTO> orderDTOS);

    Set<OrderDTO> toDTOSet(Set<Order> orders);

}
