package com.benchmarking.quarkus.imperative.controller;

import java.util.List;

import com.benchmarking.quarkus.imperative.dto.CustomerDTO;
import com.benchmarking.quarkus.imperative.entity.Customer;
import com.benchmarking.quarkus.imperative.mapper.CustomerMapper;
import com.benchmarking.quarkus.imperative.repository.CustomerRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/customers")
public class CustomerController {

    @Inject
    CustomerRepository customerRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CustomerDTO> getAllCustomersWithTransactions() {
        List<Customer> customers = customerRepository.listAll();
        return CustomerMapper.toDTOList(customers);
    }
}