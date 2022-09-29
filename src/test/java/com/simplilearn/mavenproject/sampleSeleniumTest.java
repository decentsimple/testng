package com.simplilearn.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleSeleniumTest {

	WebDriver driver;
	
	
	@Test 
	public void TestMethod() {
		/*
		 * note: Point to browser Webdriver
		System.setProperty("webdriver.gecko.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/geckodriver-v0.31.0-win64/geckodriver.exe");
		driver = new FirefoxDriver(); */
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		 // note: set web client URL
		//String paramValue = System.getProperty("PARAM_NAME_TEST");
		//driver.get(paramValue);
		driver.get("https://webclient-6-0-x.webclient-docker.cphdev.deltek.com/");
		/*driver.get("http://www.google.com"); */

		driver.manage().window().maximize();

		 // note: set login credentials and click login

		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Administrator");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@id,'login')]")).click();
		
		// note: close browser
		driver.quit();
		
		
	}
}
