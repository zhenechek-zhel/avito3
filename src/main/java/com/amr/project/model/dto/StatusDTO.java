package com.amr.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



public enum StatusDTO {
    START,
    COMPLETE,
    WAITING,
    PAID,
    SENT,
    DELIVERED
}
