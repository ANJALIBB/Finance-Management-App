package com.anjali.finance_management.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long budgetId;
    private String budgetCategory;
    private double budgetAmount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEEE dd.MMM.yyyy")
    private LocalDateTime startDate = LocalDateTime.now();
    private LocalDateTime endDate;
    private double goal;
    private double progress;


    public String getBudgetCategory() {
        return this.budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public double getBudgetAmount() {
        return this.budgetAmount;
    }

    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public double getGoal() {
        return this.goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public double getProgress() {
        return this.progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
