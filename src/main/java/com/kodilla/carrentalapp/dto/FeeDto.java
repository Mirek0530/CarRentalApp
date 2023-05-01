package com.kodilla.carrentalapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FeeDto {

    private Long id;
    private String feeName;
    private BigDecimal cost;
}
