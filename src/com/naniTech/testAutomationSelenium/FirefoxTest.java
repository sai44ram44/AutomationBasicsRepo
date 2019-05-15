package com.naniTech.testAutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Sairam\\Selenium Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	
		
		
	}

}
