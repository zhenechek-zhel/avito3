package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusDTO {
    START,
    COMPLETE,
    WAITING,
    PAID,
    SENT,
    DELIVERED
}
