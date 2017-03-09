package com.fannie.pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModelTest01 {



	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "http://expedia.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		// driver.quit();
	}
	
	
	
	@Test
	public void test() throws Exception{
		driver.get(baseUrl);
		
		FlightPagePOM.clickFlightTab(driver);
		
		FlightPagePOM.flyingFromTextBox(driver, "New York, NY (JFK-John F. Kennedy Intl.)");

		
		FlightPagePOM.flyingToTextBox(driver)
			.sendKeys("San Francisco, CA (QSF-All Airports)");
		FlightPagePOM.departDateField(driver)
			.sendKeys("03/15/2017");
		FlightPagePOM.returnDateField(driver)
			.sendKeys("03/18/2017");
		
		Thread.sleep(3000);
		
		FlightPagePOM.clickSearchButton(driver);
		
	}

}
