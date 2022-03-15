package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
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


    private CityDTO city;
    private List<UserDTO> users;
    private List<ShopDTO> shops;
    private List<OrderDTO> orders;
}
