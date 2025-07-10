package com.anjali.finance_management.controller;

import com.anjali.finance_management.model.Budget;
import com.anjali.finance_management.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BudgetControllerImpl implements BudgetController{
    private final BudgetService budgetService;

    @Autowired
    public BudgetControllerImpl(BudgetService budgetService){
        this.budgetService = budgetService;
    }

    @Override
    public List<Budget> getEveryBudget() {
        return this.budgetService.getEveryBudget();
    }

    @Override
    public Budget getBudget(Long id) {
        return this.budgetService.getBudget(id);
    }

    @Override
    public Budget createBudget(Budget budget) {
        return this.budgetService.createBudget(budget);
    }

    @Override
    public Budget updateBudget(Long id, Budget budget) {
        return this.budgetService.updateBudget(id, budget);
    }

    @Override
    public void deleteBudget(Long id) {
        this.budgetService.deleteBudget(id);
    }
}
