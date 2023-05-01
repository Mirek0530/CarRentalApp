package com.kodilla.carrentalapp.repository;

import com.kodilla.carrentalapp.entity.Fee;
import org.springframework.data.repository.CrudRepository;

public interface FeeRepository extends CrudRepository<Fee, Long> {
}
