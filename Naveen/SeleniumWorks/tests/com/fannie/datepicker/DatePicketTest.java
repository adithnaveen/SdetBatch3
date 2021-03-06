package com.fannie.datepicker;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fannie.generic.GenericMethod01;

public class DatePicketTest {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethod01 gm1 ; 
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		gm1 = new GenericMethod01(driver);
		baseUrl = "http://expedia.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		// driver.quit();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		String src = "Washington, DC (WAS-All Airports)";
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(src);
		
		
		String dest = "San Francisco, CA (QSF-All Airports)";
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(dest);

		// TODO single click on src date picker 
		driver.findElement(By.id("flight-departing-hp-flight")).click();
		
		WebElement srcDate= 
			driver.findElement(By.xpath("//*[@id='flight-departing-wrapper-hp-"
					+ "flight']/div/div/div[2]/table/tbody/tr/td/button"
					+ "[text()='20']"));
		
		srcDate.click();
		
	}

}
