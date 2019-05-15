package com.naniTech.testAutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.naniTech.testAutomationSelenium.TestNG_Listener.class)
public class TestNG_titles {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sairam\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void getTitle() {
		
		driver.get("https://www.axisbank.com");
		String actual_tile = driver.getTitle();
		Assert.assertTrue(actual_tile.contains("Personal Banking | Internet Banking"));
		System.out.println("Program Completed");
		
	}
	
	@Test(dependsOnMethods="getTitle")
	public void appStarted() {
		
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="appStarted")
	public void appRunning() {
		
		System.out.println("App is running");
	}

	
	@AfterClass
	public void closeBrowser() {
		
		driver.close();
	}
}
