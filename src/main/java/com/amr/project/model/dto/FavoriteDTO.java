package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDTO {

    private Long id;

    private Set<ShopDTO> shopsDTO;
    private Set<ItemDTO> itemsDTO;
    private UserDTO userDTO;
}