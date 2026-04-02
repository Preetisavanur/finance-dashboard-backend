package com.example.demo.service;
import com.example.demo.model.FinancialRecord;
import com.example.demo.repository.FinancialRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialService {
    private final FinancialRecordRepository repo;

    public FinancialService(FinancialRecordRepository repo) {
        this.repo = repo;
    }

    public FinancialRecord createRecord(FinancialRecord record) {
        return repo.save(record);
    }

    public List<FinancialRecord> getAllRecords() {
        return repo.findAll();
    }
}
