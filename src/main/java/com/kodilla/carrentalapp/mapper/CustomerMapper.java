package com.kodilla.carrentalapp.mapper;

import com.kodilla.carrentalapp.dto.CustomerDto;
import com.kodilla.carrentalapp.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerMapper {

    public CustomerDto mapToCustomerDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getRentList()
        );
    }

    public Customer mapToCustomer(CustomerDto customerDto) {
        return new Customer(
                customerDto.getId(),
                customerDto.getFirstname(),
                customerDto.getLastname(),
                new ArrayList<>()
        );
    }

    public List<CustomerDto> mapToCustomerDtoList(List<Customer> customers) {
        return customers.stream()
                .map(this::mapToCustomerDto)
                .collect(Collectors.toList());
    }
}
