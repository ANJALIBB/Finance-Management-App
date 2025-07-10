package com.anjali.finance_management.repository;

import com.anjali.finance_management.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<Budget,Long> {
    List<Budget> findAllByOrderByBudgetIdAsc();
}
