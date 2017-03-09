package com.fannie.screenshot;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fannie.pom.DriverFactory;
import com.fannie.pom.FlightPagePOMFactory;
import com.fannie.utility.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginReportTest {

	// by doing @BeforeClass the method is loaded only once per 
	// jUnit test case/s
	private static WebDriver driver;
	private String baseUrl;
	// report variable 
	
	// is called as report handler and will store the reports 
	private ExtentReports report;
	// create the logs 
	private ExtentTest test;
	
	@BeforeClass
	public static void beforeClass(){
		driver = DriverFactory.getDriver("chrome");
	}
	@After
	public void TearDown() throws InterruptedException, IOException{
	
		driver.quit();
		report.endTest(test);
		report.flush();
	}
	@Before
	public void setUp(){
		
		baseUrl="http://cinetalenters.com/#/login";
		String filePath="C:\\Users\\Lenovo\\Desktop\\reports\\LoginReportTest.html";
		report = new ExtentReports(filePath);
		
		test = report.startTest("verify Login For user");
		
		test.log(LogStatus.INFO, "Before Loading Base url");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "After Maximize of Window");
		
		driver.get(baseUrl);
		
	}
	@Test
	public void test() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("adith.naveen@gmail.com");
		
		test.log(LogStatus.INFO, "user name sent to server");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret@123");

		test.log(LogStatus.INFO, "password sent to server");
		
		WebElement subBtn = 
				driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/form/div[3]/div/button"));
		subBtn.click();
		
		test.log(LogStatus.INFO, "Clicked on Submit Btn");
		
	
	}

}
