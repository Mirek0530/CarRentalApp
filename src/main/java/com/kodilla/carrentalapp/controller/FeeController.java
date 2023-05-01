package com.kodilla.carrentalapp.controller;

import com.kodilla.carrentalapp.dto.FeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fee")
@RequiredArgsConstructor
public class FeeController {

    @GetMapping
    public List<FeeDto> getAllFees() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{feeId}")
    public FeeDto getFee(@PathVariable Long feeId) {
        return new FeeDto();
    }

    @PostMapping
    public void createFee(@RequestBody FeeDto feeDto) {

    }

    @PutMapping
    public void updateFee(@RequestBody FeeDto feeDto) {

    }

    @DeleteMapping(value = "{feeId}")
    public void deleteFee(@PathVariable Long feeId) {

    }
}
