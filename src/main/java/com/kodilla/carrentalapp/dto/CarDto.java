package com.kodilla.carrentalapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Long id;
    private String maker;
    private String model;
    private String description;
    private boolean isAvailable;
}
