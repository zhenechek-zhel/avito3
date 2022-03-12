package com.amr.project.model.dto;

import com.amr.project.model.entity.User;
import com.amr.project.model.enums.Gender;
import lombok.*;

import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto {
    private Long id;

    private String phone;
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    private Calendar birthday;
    private UserDto user;
}
