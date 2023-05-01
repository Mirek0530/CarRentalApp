package com.kodilla.carrentalapp.mapper;

import com.kodilla.carrentalapp.dto.FeeDto;
import com.kodilla.carrentalapp.entity.Fee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeeMapper {

    public FeeDto mapToFeeDto(Fee fee) {
        return new FeeDto(
                fee.getId(),
                fee.getFeeName(),
                fee.getCost()
        );
    }

    public Fee mapToFee(FeeDto feeDto) {
        return new Fee(
                feeDto.getId(),
                feeDto.getFeeName(),
                feeDto.getCost()
        );
    }

    public List<FeeDto> mapToFeeDtoList(List<Fee> fees) {
        return fees.stream()
                .map(this::mapToFeeDto)
                .collect(Collectors.toList());
    }
}
