package com.example.demo.service;

import com.example.demo.model.FinancialRecord;
import com.example.demo.model.Type;
import com.example.demo.repository.FinancialRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    private final FinancialRecordRepository repo;

    public DashboardService(FinancialRecordRepository repo) {
        this.repo = repo;
    }

    public double getTotalIncome() {
        return repo.findAll().stream()
                .filter(r -> r.getType() == Type.INCOME)
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public double getTotalExpense() {
        return repo.findAll().stream()
                .filter(r -> r.getType() == Type.EXPENSE)
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public double getNetBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}
