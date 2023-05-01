package com.kodilla.carrentalapp.controller;

import com.kodilla.carrentalapp.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    @GetMapping
    public List<CarDto> getAllCars() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{carId}")
    public CarDto getCar(@PathVariable Long carId) {
        return new CarDto();
    }

    @PostMapping
    public void createCar(@RequestBody CarDto carDto) {

    }

    @PutMapping
    public void updateCar(@RequestBody CarDto carDto) {

    }

    @DeleteMapping(value = "{carId}")
    public void deleteCar(@PathVariable Long carId) {

    }
}
