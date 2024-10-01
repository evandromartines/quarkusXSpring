package com.benchmarking.quarkus.reactive.repository;

import com.benchmarking.quarkus.reactive.entity.Transaction;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class TransactionRepository implements PanacheRepositoryBase<Transaction, Long> {

}