package com.fannie.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPagePOM {
	static private WebElement element;

	public static void flyingFromTextBox(WebDriver driver, String source) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.sendKeys(source);
	}

	public static WebElement flyingToTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		return element;
	}

	public static WebElement departDateField(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing-hp-flight"));
		return element;
	}

	public static WebElement returnDateField(WebDriver driver) {
		
		synchronized (driver) {
			
		
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		driver.findElement(By.id("flight-returning-hp-flight")).clear();
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		}
		return element;
	}
	
	public static void clickFlightTab(WebDriver driver){
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}

	
	public static void clickSearchButton(WebDriver driver){
		driver.findElement
			(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[7]/label/button")).
				click();
	}


	

}
