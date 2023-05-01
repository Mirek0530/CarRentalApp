package com.kodilla.carrentalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String lastname;

    @OneToMany(
            targetEntity = Rent.class,
            mappedBy = "id",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Rent> rentList;
}
