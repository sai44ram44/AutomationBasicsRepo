package com.naniTech.testAutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCRMTest {
	
	WebDriver driver;
	@BeforeMethod
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sairam\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void getProduct(String mainProduct, String subProduct) {
		driver.get("https://www.amazon.in/");
		WebElement mainProductLink = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/child::div[2]"
				+ "/span[@aria-label='"+ mainProduct +"']"));
		Actions action = new Actions(driver);
		action.moveToElement(mainProductLink).build().perform();
		
		WebElement subProductLink = driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/descendant::span[text()='"+ subProduct +"'] | //div[@id='nav-flyout-shopAll']/child"
					+ "::div[3]/descendant::span//span[text() = '"+ subProduct +"']"));
		subProductLink.click();
		
	}
	
	@Test
	public void getTitle() {
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sai44ram44");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sqc800");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
