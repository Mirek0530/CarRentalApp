package com.kodilla.carrentalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "FEES")
public class Fee {

    @Id
    @GeneratedValue
    @Column(name = "FEE_ID")
    private Long id;
    private String feeName;
    private BigDecimal cost;
}
