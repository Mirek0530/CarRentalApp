package com.kodilla.carrentalapp.dto;

import com.kodilla.carrentalapp.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private Long id;
    private String firstname;
    private String lastname;
    private List<Rent> rentList;
}
