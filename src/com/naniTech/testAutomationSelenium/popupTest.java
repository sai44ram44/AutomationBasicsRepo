package com.naniTech.testAutomationSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class popupTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sairam\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/popuptest2.html");
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
	

		
		

	}

}
