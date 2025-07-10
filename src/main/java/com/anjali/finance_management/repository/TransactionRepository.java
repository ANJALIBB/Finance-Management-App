package com.anjali.finance_management.repository;

import com.anjali.finance_management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findAllByOrderByTransactionIdAsc();

    List<Transaction> findAllByOrderByTransactionAmountAsc();

    List<Transaction> findAllByOrderByTransactionAmountDesc();

    List<Transaction> findAllByOrderByTransactionDateAsc();
}
