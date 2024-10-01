package com.benchmarking.quarkus.reactive.controller;

import java.util.List;

import com.benchmarking.quarkus.reactive.dto.CustomerDTO;
import com.benchmarking.quarkus.reactive.entity.Customer;
import com.benchmarking.quarkus.reactive.mapper.CustomerMapper;
import com.benchmarking.quarkus.reactive.repository.CustomerRepository;

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