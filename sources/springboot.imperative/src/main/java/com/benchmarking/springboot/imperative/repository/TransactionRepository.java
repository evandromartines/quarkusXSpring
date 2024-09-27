package com.benchmarking.springboot.imperative.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.benchmarking.springboot.imperative.entity.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}