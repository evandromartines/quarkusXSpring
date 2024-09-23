package com.benchmarking.springboot.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.benchmarking.springboot.reactive.entity.Transaction;

import reactor.core.publisher.Flux;

public interface TransactionRepository extends ReactiveCrudRepository<Transaction, Long> {

    Flux<Transaction> findByCustomerId(Long customerId);
}