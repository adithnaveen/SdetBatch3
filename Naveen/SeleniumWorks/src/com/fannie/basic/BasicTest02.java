package com.fannie.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// http://naveenks.com/selenium/RegForm.html
public class BasicTest02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver ; 
		String baseUrl = "http://google.com";
		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib"))
			.sendKeys("best places to visit in virginia");
	
		
		driver.findElement(By.name("btnG")).click();
	
	}
}
