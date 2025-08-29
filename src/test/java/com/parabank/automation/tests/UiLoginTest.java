package com.parabank.automation.tests;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UiLoginTest extends BaseTest {

    @Test
    void testLogin() {
        try {
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
            Thread.sleep(3000);

            driver.findElement(By.name("username")).sendKeys("arunchenna");
            Thread.sleep(2000);
            driver.findElement(By.name("password")).sendKeys("arun123");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@value='Log In']")).click();
            Thread.sleep(2000);

            boolean success = driver.getPageSource().contains("Accounts Overview");

            resultService.saveResult("Login_UI", success ? "PASSED" : "FAILED", null);
        } catch (Exception e) {
            resultService.saveResult("Login_UI", "FAILED", e.getMessage());
        }
    }
}
