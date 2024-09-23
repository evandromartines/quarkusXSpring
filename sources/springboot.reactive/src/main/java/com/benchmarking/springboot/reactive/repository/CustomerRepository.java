package com.benchmarking.springboot.reactive.repository;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.benchmarking.springboot.reactive.entity.Customer;

import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {
 
    Flux<Customer> findAll();
}