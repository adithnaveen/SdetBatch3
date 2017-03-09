package com.fannie.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageObjectModelTest02 {

	// by doing @BeforeClass the method is loaded only once per 
	// jUnit test case/s
	private static WebDriver driver;
	private FlightPagePOMFactory flightFactory;
	private String baseUrl;
	@BeforeClass
	public static void beforeClass(){
		driver = DriverFactory.getDriver("chrome");
	}
	@After
	public void TearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
	}
	@Before
	public void setUp(){
		flightFactory = new FlightPagePOMFactory(driver);
		baseUrl="http://expedia.com";
		driver.get(baseUrl);
	}
	@Test
	public void test() {
		flightFactory.clickFlightTab();
		flightFactory.sendFlyingFrom("New York, NY (JFK-John F. Kennedy Intl.)");
		flightFactory.sendFlyingTo("New York, NY (JFK-John F. Kennedy Intl.)");
		flightFactory.sendDepartingDate("03/11/2017");
		flightFactory.sendReturnDate("04/21/2017");
		flightFactory.clickSearchButton();
	}

}
