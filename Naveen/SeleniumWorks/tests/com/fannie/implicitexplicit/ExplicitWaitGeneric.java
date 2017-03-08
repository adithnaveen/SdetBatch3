package com.fannie.implicitexplicit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.utility.WaitTypes;

public class ExplicitWaitGeneric {


	private WebDriver driver;
	private String baseUrl;
	private WaitTypes wt;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "http://naveenks.com/selenium/LoginForm.html";
		wt = new WaitTypes(driver);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement email = wt.waitForElement(By.id("uname"), 5);
		email.sendKeys("hello@gmail.com");
		
		WebElement pwd = wt.waitForElement(By.id("pwd"), 6);
		pwd.sendKeys("testing@123");

		wt.clickWhenReady(By.id("submitBtn"), 3);
	}

}




