package com.example.banking_transaction_servicemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banking_transaction_servicemanagement.dto.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
  
}