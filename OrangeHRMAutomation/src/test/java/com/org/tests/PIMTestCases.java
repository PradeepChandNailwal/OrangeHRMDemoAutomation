package com.org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.main.BaseTest;

public class PIMTestCases extends BaseTest {
	@BeforeClass
	public void validateLogin() {
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void validatePIMMenu() {
		WebElement pimButton = driver.findElement(By.xpath("//span[text()='PIM']"));
		pimButton.click();
	}
}
