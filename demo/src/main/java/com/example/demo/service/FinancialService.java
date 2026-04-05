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

    public FinancialRecord updateRecord(Long id, FinancialRecord record) {
        record.setId(id);
        return repo.save(record);
    }

    public void deleteRecord(Long id) {
        repo.deleteById(id);
    }
}
