package com.benchmarking.springboot.imperative.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.benchmarking.springboot.imperative.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
