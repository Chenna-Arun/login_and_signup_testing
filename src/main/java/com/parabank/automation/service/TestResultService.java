package com.parabank.automation.service;



import com.parabank.automation.db.TestResult;
import com.parabank.automation.db.TestResultRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TestResultService {

    private final TestResultRepository repo;

    public TestResultService(TestResultRepository repo) {
        this.repo = repo;
    }

    public void saveResult(String testName, String status, String error) {
        TestResult result = new TestResult();
        result.setTestName(testName);
        result.setStatus(status);
        result.setErrorMessage(error);
        result.setExecutionTime(LocalDateTime.now());
        repo.save(result);
    }
}
