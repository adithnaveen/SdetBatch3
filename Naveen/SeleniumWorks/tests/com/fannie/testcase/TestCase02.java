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

// this program to show working of the filed is enabled 
// or disable with google.com 

public class TestCase02 {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "http://google.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void testGoogleSite() {
		driver.get(baseUrl);
		/*WebElement e1 = driver.findElement(By.id("lst-ib"));
		System.out.println("lst-ib is enabled:" + e1.isEnabled());
		e1.sendKeys("weather in virginia");*/
		
		WebElement e2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("gs_taif0 is enabled: " + e2.isEnabled());
		e2.sendKeys("weather in virginia");
		/*		
		WebElement e3 = driver.findElement(By.id("gs_htif0"));
		System.out.println("gs_htif0 is enabled: " + e3.isEnabled());
*/		
		
	}

}
