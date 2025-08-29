# ParaBank Automation Framework

This project is a simple **automation framework** built using:
- **Spring Boot + Maven** as the project base
- **Selenium WebDriver** for UI testing
- **Rest-Assured** for API testing
- **MySQL** for storing test results

It covers **Sign-Up** and **Login** flows for the [ParaBank demo website](https://parabank.parasoft.com), validating both **UI** and **API** functionality.

---

## How It Works
1. **UI Tests** – Automate browser interactions for Sign-Up and Login using Selenium.
2. **API Tests** – Send requests to ParaBank REST APIs using Rest-Assured.
3. **Result Storage** – Each test stores its result (test name, status, time, error if any) into MySQL.

---

## Commands to Run Tests

### Run All Tests (UI + API)
```bash
mvn clean test
```
---
## Run Only UI Tests
```bash
mvn "-Dtest=UiSignUpTest,UiLoginTest" test
```

## Run Only API Tests
```bash
mvn "-Dtest=ApiSignUpTest,ApiLoginTest" test
```
