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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait01 {

	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "http://cinetalenters.com/#/";
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
		driver.findElement
		(By.xpath("/html/body/div[1]/div[1]/div/div/div[3]/h4/a[2]/span")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement email =  wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("email"))
				);
				
		email.sendKeys("testing@gmail.com");
	}

}
