package com.kodilla.carrentalapp.controller;

import com.kodilla.carrentalapp.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    @GetMapping
    public List<CustomerDto> getAllCustomers() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{customerId}")
    public CustomerDto getCustomer(@PathVariable Long customerId) {
        return new CustomerDto();
    }

    @PostMapping
    public void createCustomer(@RequestBody CustomerDto customerDto) {

    }

    @PutMapping
    public void updateCustomer(@RequestBody CustomerDto customerDto) {

    }

    @DeleteMapping(value = "{customerId}")
    public void deleteCustomer(@PathVariable Long customerId) {

    }
}
