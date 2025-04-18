package com.example.banking_transaction_servicemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.banking_transaction_servicemanagement.dto.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
   List<Transaction> findByType(String type);

	   
	    List<Transaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
	    @Query("SELECT t FROM Transaction t WHERE " +
	           "(:type IS NULL OR t.type = :type) AND " +
	           "(:start IS NULL OR t.timestamp >= :start) AND " +
	           "(:end IS NULL OR t.timestamp <= :end)")
	    List<Transaction> findFiltered(
	            @Param("type") String type,
	            @Param("start") LocalDateTime start,
	            @Param("end") LocalDateTime end);
	   
}
}
