package com.benchmarking.quarkus.imperative.mapper;

import com.benchmarking.quarkus.imperative.dto.CustomerDTO;
import com.benchmarking.quarkus.imperative.dto.TransactionDTO;
import com.benchmarking.quarkus.imperative.entity.Customer;
import com.benchmarking.quarkus.imperative.entity.Transaction;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerMapper {

    public static CustomerDTO toDTO(Customer customer) {
        CustomerDTO dto = new CustomerDTO();
        dto.setId(customer.id);  // Panache usa `id` em vez de `getId()`
        dto.setName(customer.getName());
        dto.setEmail(customer.getEmail());
        dto.setAccountNumber(customer.getAccountNumber());
        dto.setBalance(customer.getBalance());

        if (customer.getTransactions() != null) {
            List<TransactionDTO> transactionDTOs = customer.getTransactions().stream()
                    .map(CustomerMapper::toTransactionDTO)
                    .collect(Collectors.toList());
            dto.setTransactions(transactionDTOs);
        }

        return dto;
    }

    public static List<CustomerDTO> toDTOList(List<Customer> customers) {
        return customers.stream()
                        .map(CustomerMapper::toDTO)
                        .collect(Collectors.toList());
    }

    private static TransactionDTO toTransactionDTO(Transaction transaction) {
        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setId(transaction.getId());
        transactionDTO.setTransactionDate(transaction.getTransactionDate());
        transactionDTO.setTransactionType(transaction.getTransactionType());
        transactionDTO.setAmount(transaction.getAmount());
        transactionDTO.setDescription(transaction.getDescription());
        return transactionDTO;
    }
}
