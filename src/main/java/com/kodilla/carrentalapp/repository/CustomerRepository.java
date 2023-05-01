package com.kodilla.carrentalapp.repository;

import com.kodilla.carrentalapp.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
