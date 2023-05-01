package com.kodilla.carrentalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RENTS")
public class Rent {

    @Id
    @GeneratedValue
    @Column(name = "RENT_ID")
    private Long id;
    private LocalDateTime startOfRent;
    private LocalDateTime endOfRent;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "RENT_FEES",
            joinColumns = {@JoinColumn(name = "RENT_ID", referencedColumnName = "RENT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "FEE_ID", referencedColumnName = "FEE_ID")}
    )
    private List<Fee> fees;
    @OneToOne
    private Car carId;
}
