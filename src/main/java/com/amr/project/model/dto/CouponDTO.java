package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {

    private Long id;
    private Calendar start;
    private Calendar end;

    private UserDTO userDTO;
}
