package com.kodilla.carrentalapp.dto;

import com.kodilla.carrentalapp.entity.Car;
import com.kodilla.carrentalapp.entity.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RentDto {

    private Long id;
    private LocalDateTime startOfRent;
    private LocalDateTime endOfRent;
    private List<Fee> fees;
    private Car carId;
}
