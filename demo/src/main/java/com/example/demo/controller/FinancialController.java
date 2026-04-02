package com.example.demo.controller;

import com.example.demo.model.FinancialRecord;
import com.example.demo.service.FinancialService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")

public class FinancialController {
    private final FinancialService service;

    public FinancialController(FinancialService service) {
        this.service = service;
    }

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record) {

        // Temporary role check (hardcoded for now)
        String role = "ADMIN"; // simulate logged-in user

        if (!role.equals("ADMIN")) {
            throw new RuntimeException("Only ADMIN can create records");
        }

        return service.createRecord(record);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAllRecords();
    }
}
