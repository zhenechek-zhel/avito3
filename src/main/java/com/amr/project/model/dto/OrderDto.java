package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private Calendar orderDate;
    private Calendar expectedDeliveryDate;
    private BigDecimal grandTotal;
    private String currency;
    private String description;


    private StatusDto status;
    private UserDto user;
    private List<ItemDto> itemsInOrder;
    private AddressDto address;


}
