package com.org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.main.BaseTest;

public class LoginPageTests extends BaseTest{	
	
	@Test
	public void validateLogin() {
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}
	
	

}
