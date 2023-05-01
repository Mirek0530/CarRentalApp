package com.kodilla.carrentalapp.mapper;

import com.kodilla.carrentalapp.dto.CarDto;
import com.kodilla.carrentalapp.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarMapper {

    public CarDto mapToCarDto(Car car) {
        return new CarDto(
                car.getId(),
                car.getMaker(),
                car.getModel(),
                car.getDescription(),
                car.isAvailable()
        );
    }

    public Car mapToCar(CarDto carDto) {
        return new Car(
                carDto.getId(),
                carDto.getMaker(),
                carDto.getModel(),
                carDto.getDescription(),
                carDto.isAvailable()
        );
    }

    public List<CarDto> mapToCarDtoList(List<Car> cars) {
        return cars.stream()
                .map(this::mapToCarDto)
                .collect(Collectors.toList());
    }
}
