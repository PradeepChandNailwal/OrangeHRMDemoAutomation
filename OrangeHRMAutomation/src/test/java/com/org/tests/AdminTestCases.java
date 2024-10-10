package com.org.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.main.BaseTest;
import com.org.utils.CommonLibrary;

public class AdminTestCases extends BaseTest {

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
		WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
		adminButton.click();
	}

	@Test(enabled = false)
	public void validateJobTitles() {
		CommonLibrary.customWait(3000);
		WebElement jobDropdown = driver.findElement(By.xpath("//span[contains(text(),'Job')]/i"));
		jobDropdown.click();
		WebElement jobTitle = driver.findElement(By.xpath("//a[text()='Job Titles']"));
		jobTitle.click();
		CommonLibrary.customWait(3000);
		WebElement addBtn = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addBtn.click();
		CommonLibrary.customWait(3000);
		WebElement job_Title = driver.findElement(By.xpath(
				"//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
		job_Title.sendKeys("Automation Tester");
		WebElement job_Desc = driver.findElement(By.xpath("//textarea[@placeholder='Type description here']"));
		job_Desc.sendKeys("Selenium Automation Tester");
		WebElement addNote = driver.findElement(By.xpath("//textarea[@placeholder='Add note']"));
		addNote.sendKeys("Selenium TestNg Maven");
		WebElement saveBtn = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		saveBtn.click();
	}

	@Test(enabled = false)
	public void validatePayGrades() {
		CommonLibrary.customWait(3000);
		WebElement jobDropdown = driver.findElement(By.xpath("//span[contains(text(),'Job')]/i"));
		jobDropdown.click();
		WebElement jobTitle = driver.findElement(By.xpath("//a[text()='Pay Grades']"));
		jobTitle.click();
		CommonLibrary.customWait(3000);
	}
	
	@Test(enabled = true)
	public void validateWorkShifts() {
		CommonLibrary.customWait(3000);
		WebElement jobDropdown = driver.findElement(By.xpath("//span[contains(text(),'Job')]/i"));
		jobDropdown.click();
		WebElement jobTitle = driver.findElement(By.xpath("//a[text()='Work Shifts']"));
		jobTitle.click();
		CommonLibrary.customWait(3000);
		WebElement addBtn = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addBtn.click();
		CommonLibrary.customWait(3000);
		WebElement shiftName = driver.findElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));	
		shiftName.sendKeys("Night Shift");
		WebElement workingHourFrom = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		workingHourFrom.clear();
		workingHourFrom.sendKeys("11:00 AM");
		WebElement workingHourTo = driver.findElement(By.xpath("(//input[@placeholder='hh:mm'])[2]"));
		workingHourTo.clear();
		workingHourTo.sendKeys("07:00 PM");
		CommonLibrary.customWait(3000);
		WebElement saveBtn = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		saveBtn.click();
		saveBtn.click();
	}
}
