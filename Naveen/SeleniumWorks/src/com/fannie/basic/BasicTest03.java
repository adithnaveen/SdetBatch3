package com.fannie.basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest03 {
	public static void main(String[] args) throws InterruptedException {
		String baseUrl ="http://naveenks.com/selenium/RegForm.html";
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get(baseUrl);
			driver.manage().window().maximize();
	
			driver.findElement(By.id("inputEmail")).sendKeys("john@doe.com");
			driver.findElement(By.id("firstName")).sendKeys("JOHN");
			Thread.sleep(3000);
			driver.findElement(By.id("firstName")).clear();
	}
}
