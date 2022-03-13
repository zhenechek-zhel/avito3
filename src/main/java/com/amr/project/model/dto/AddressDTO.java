package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;
    private String cityIndex;
    private String street;
    private String house;


    private CityDTO cityDTO;
    private Set<UserDTO> usersDTO;
    private Set<ShopDTO> shopsDTO;
    private Set<OrderDTO> ordersDTO;
}
