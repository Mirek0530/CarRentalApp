package com.kodilla.carrentalapp.repository;

import com.kodilla.carrentalapp.entity.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CarRepository extends CrudRepository<Car, Long> {
}
