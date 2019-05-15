package com.naniTech.testAutomationSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.naniTech.automation.utils.TestUtils;

public class BootStrapDropDown {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sairam\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_TIMEOUT,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_9");
		
		WebElement dropdownBtn = driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle "
				+ "btn btn-default']"));
		dropdownBtn.click();
		clickSelected("javascript");
		
		//driver.close();
	}
	
	public static void clickSelected(String choice) {
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@class='form-control multiselect-search']"));
		searchBtn.sendKeys(choice);
		
		driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"
				+ "/li/a/label[contains(text(),'"+choice+"')]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default multiselect-clear-filter']")).click();
		
	}

}
