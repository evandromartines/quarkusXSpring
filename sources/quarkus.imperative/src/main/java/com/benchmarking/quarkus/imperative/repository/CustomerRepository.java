package com.benchmarking.quarkus.imperative.repository;

import com.benchmarking.quarkus.imperative.entity.Customer;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {

}