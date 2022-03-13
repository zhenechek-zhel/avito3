package com.amr.project.converter.sets;

import com.amr.project.converter.OrderMapper;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Order;
import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(uses = OrderMapper.class)
public interface OrderSetMapper {
    Set<Order> toEntitySet(Set<OrderDTO> dtos);
    Set<OrderDTO> toDTOSet(Set<Order> entities);

}
