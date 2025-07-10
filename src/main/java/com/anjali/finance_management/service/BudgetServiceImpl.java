package com.anjali.finance_management.service;

import com.anjali.finance_management.exception.EntityNotFoundException;
import com.anjali.finance_management.model.Budget;
import com.anjali.finance_management.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BudgetServiceImpl implements BudgetService{
    private final BudgetRepository budgetRepository;

    @Autowired
    public BudgetServiceImpl(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    @Override
    public List<Budget> getEveryBudget() {
        return this.budgetRepository.findAllByOrderByBudgetIdAsc();
    }

    @Override
    public Budget getBudget(Long id) {
        if (this.budgetRepository.findById(id).isPresent()) {
            return this.budgetRepository.getReferenceById(id);
        }
        throw new EntityNotFoundException("Budget not found with id: " + id);
    }

    @Override
    public Budget createBudget(Budget budget) {
        return this.budgetRepository.save(budget);
    }

    @Override
    public Budget updateBudget(Long id, Budget updatedBudget) {
        Budget budget = this.budgetRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Budget not found with id: " + id));

        budget.setBudgetCategory(updatedBudget.getBudgetCategory());
        budget.setBudgetAmount(updatedBudget.getBudgetAmount());
        budget.setStartDate(updatedBudget.getStartDate());
        budget.setEndDate(updatedBudget.getEndDate());
        budget.setGoal(updatedBudget.getGoal());
        budget.setProgress(updatedBudget.getProgress());

        return this.budgetRepository.save(budget);
    }

    @Override
    public void deleteBudget(Long id) {
        this.budgetRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Budget not found with id: " + id));
        this.budgetRepository.deleteById(id);
    }
}
