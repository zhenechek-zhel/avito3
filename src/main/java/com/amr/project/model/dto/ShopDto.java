package com.amr.project.model.dto;

import com.amr.project.model.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;



@Getter
@Setter
@ToString
public class ShopDto {

    @JsonProperty(required = true)
    @NotBlank
    @NotEmpty
    private String name;

    @JsonProperty(required = true)
    @Email(message = "Email should be valid")
    private String email;

    @JsonProperty(required = true)
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String phone;

    @JsonProperty(required = true)
    @NotEmpty
    @NotBlank
    private String description;

    @JsonProperty(required = true)
    @NotNull
    private Country location;

    @JsonProperty(required = true)
    @NotNull
    private Image logo;

    @JsonProperty(required = true)
    @NotNull
    private User user;

    @JsonProperty(required = true)
    @NotNull
    private Address address;
}
