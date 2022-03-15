package com.amr.project.service.abstracts;

import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.dto.MessageDTO;
import com.amr.project.model.dto.OrderDTO;
import com.amr.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderRepository {
    List<OrderDTO> getAllOrders();

    OrderDTO getOrderById(Long id);

    void saveOrder(OrderDTO orderDTO);

    void updateOrder(OrderDTO orderDTO);

    void deleteOrder(Long id);
}
