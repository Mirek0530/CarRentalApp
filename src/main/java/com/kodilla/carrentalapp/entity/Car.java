package com.kodilla.carrentalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CARS")
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String maker;
    private String model;
    private String description;
    private boolean isAvailable;
}
