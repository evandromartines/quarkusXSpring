package com.benchmarking.quarkus.reactive.repository;

import com.benchmarking.quarkus.reactive.entity.Customer;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements PanacheRepositoryBase<Customer, Long> {

}