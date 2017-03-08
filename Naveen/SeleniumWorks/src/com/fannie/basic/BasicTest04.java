package com.fannie.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest04 {
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://demostore.x-cart.com/";

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();

//		driver.findElement(By.linkText("Shipping")).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.partialLinkText("Contact")).click();
		
		// failed case 
		//driver.findElement(By.tagName("a")).click();
		
	}
}
