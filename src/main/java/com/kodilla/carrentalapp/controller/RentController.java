package com.kodilla.carrentalapp.controller;

import com.kodilla.carrentalapp.dto.RentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rent")
@RequiredArgsConstructor
public class RentController {

    @GetMapping
    public List<RentDto> getAllRents() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{rentId}")
    public RentDto getRent(@PathVariable Long rentId) {
        return new RentDto();
    }

    @PostMapping
    public void createRent(@RequestBody RentDto rentDto) {

    }

    @PutMapping
    public void updateRent(@RequestBody RentDto rentDto) {

    }

    @DeleteMapping(value = "{rentId}")
    public void deleteRent(@PathVariable Long rentId) {

    }
}
