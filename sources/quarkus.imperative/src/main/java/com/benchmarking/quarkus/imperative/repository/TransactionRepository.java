package com.benchmarking.quarkus.imperative.repository;

import jakarta.enterprise.context.ApplicationScoped;
import com.benchmarking.quarkus.imperative.entity.Transaction;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TransactionRepository implements PanacheRepository<Transaction> {

}