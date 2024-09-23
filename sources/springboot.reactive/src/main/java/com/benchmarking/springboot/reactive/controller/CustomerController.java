package com.benchmarking.springboot.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.benchmarking.springboot.reactive.entity.Customer;
import com.benchmarking.springboot.reactive.repository.CustomerRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Flux<Customer> getAllCustomersWithTransactions() {
        return customerRepository.findAll();
    }
}