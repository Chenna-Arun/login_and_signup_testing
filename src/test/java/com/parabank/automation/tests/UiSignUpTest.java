package com.parabank.automation.tests;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UiSignUpTest extends BaseTest {

    @Test
    void testSignUp() {
        try {
            driver.get("https://parabank.parasoft.com/parabank/register.htm");
            Thread.sleep(2000);

            driver.findElement(By.id("customer.firstName")).sendKeys("arun");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.lastName")).sendKeys("chenna");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.address.street")).sendKeys("street near BY");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.address.city")).sendKeys("NY");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.address.state")).sendKeys("NY");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("5/342,nagar");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.ssn")).sendKeys("111-222-333");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.username")).sendKeys("arunchenna");
            Thread.sleep(2000);
            driver.findElement(By.id("customer.password")).sendKeys("arun123");
            Thread.sleep(2000);
            driver.findElement(By.id("repeatedPassword")).sendKeys("arun123");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@value='Register']")).click();
            Thread.sleep(2000);

            boolean success = driver.getPageSource().contains("Your account was created successfully");

            resultService.saveResult("SignUp_UI", success ? "PASSED" : "FAILED", null);
        } catch (Exception e) {
            resultService.saveResult("SignUp_UI", "FAILED", e.getMessage());
        }
    }
}

