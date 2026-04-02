package com.example.demo.controller;

import com.example.demo.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @GetMapping("/summary")
    public Map<String, Double> getSummary() {
        double income = service.getTotalIncome();
        double expense = service.getTotalExpense();
        double balance = service.getNetBalance();

        Map<String, Double> result = new HashMap<>();
        result.put("totalIncome", income);
        result.put("totalExpense", expense);
        result.put("netBalance", balance);

        return result;
    }


}