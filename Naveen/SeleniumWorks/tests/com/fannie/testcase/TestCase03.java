package com.fannie.testcase;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase03 {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "http://naveenks.com/selenium/RegForm.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	
	
	@Test
	public void clickTestRadioCheck() throws Exception{
		// loads the web page  or web application
		driver.get(baseUrl);
		
		WebElement genderMale = driver.findElement(By.id("genderMale"));
		genderMale.click();
		Thread.sleep(1000);
		
		WebElement genderFemale = driver.findElement(By.id("genderFemale"));
		genderFemale.click();
		Thread.sleep(1000);
		
		WebElement genderTrans = driver.findElement(By.id("genderTrans"));
		genderTrans.click();
		
		Thread.sleep(2000);
		
		genderMale.click();
		
		System.out.println("Male click? -> " + genderMale.isSelected());
		System.out.println("Female click? -> " + genderFemale.isSelected());
		System.out.println("Trans Gender click ? -> " + genderTrans.isSelected());
		
		
	}

}















