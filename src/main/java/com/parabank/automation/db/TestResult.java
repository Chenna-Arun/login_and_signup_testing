package com.parabank.automation.db;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testName;
    private String status;
    private String errorMessage;
    private LocalDateTime executionTime;

    // Getters & Setters

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(LocalDateTime executionTime) {
        this.executionTime = executionTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public TestResult(String errorMessage, Long id, String testName, String status, LocalDateTime executionTime) {
        this.errorMessage = errorMessage;
        this.id = id;
        this.testName = testName;
        this.status = status;
        this.executionTime = executionTime;
    }

    public TestResult() {
    }
}
