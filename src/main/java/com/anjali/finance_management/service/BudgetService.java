package com.anjali.finance_management.service;

import com.anjali.finance_management.model.Budget;

import java.util.List;

public interface BudgetService {
    List<Budget> getEveryBudget();

    Budget getBudget(Long id);

    Budget createBudget(Budget budget);

    Budget updateBudget(Long id, Budget updatedBudget);

    void deleteBudget(Long id);
}
