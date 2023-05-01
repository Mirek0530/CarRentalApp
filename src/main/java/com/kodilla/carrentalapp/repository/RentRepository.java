package com.kodilla.carrentalapp.repository;

import com.kodilla.carrentalapp.entity.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long> {
}
