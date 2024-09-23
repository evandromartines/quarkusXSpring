package com.benchmarking.springboot.imperative.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import jakarta.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}