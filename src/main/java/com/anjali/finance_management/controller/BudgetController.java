package com.anjali.finance_management.controller;

import com.anjali.finance_management.model.Budget;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/budget")
public interface BudgetController {
    @GetMapping
    List<Budget> getEveryBudget();

    @GetMapping("/{id}")
    Budget getBudget(@PathVariable Long id);

    @PostMapping
    Budget createBudget(@RequestBody Budget budget);

    @PutMapping("/{id}")
    Budget updateBudget(@PathVariable Long id, @RequestBody Budget budget);

    @DeleteMapping("/{id}")
    void deleteBudget(@PathVariable Long id);
}
