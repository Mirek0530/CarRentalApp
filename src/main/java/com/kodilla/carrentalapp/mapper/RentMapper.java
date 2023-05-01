package com.kodilla.carrentalapp.mapper;

import com.kodilla.carrentalapp.dto.RentDto;
import com.kodilla.carrentalapp.entity.Rent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentMapper {

    public RentDto mapToRentDto(Rent rent) {
        return new RentDto(
                rent.getId(),
                rent.getStartOfRent(),
                rent.getEndOfRent(),
                rent.getFees(),
                rent.getCarId()
        );
    }

    public Rent mapToRent(RentDto rentDto) {
        return new Rent(
                rentDto.getId(),
                rentDto.getStartOfRent(),
                rentDto.getEndOfRent(),
                rentDto.getFees(),
                rentDto.getCarId()
        );
    }

    public List<RentDto> mapToRentDtoList(List<Rent> rents) {
        return rents.stream()
                .map(this::mapToRentDto)
                .collect(Collectors.toList());
    }
}
