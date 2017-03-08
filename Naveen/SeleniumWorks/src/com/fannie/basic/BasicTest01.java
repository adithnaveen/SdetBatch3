package com.fannie.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicTest01 {
	public static void main(String[] args) {
		WebDriver driver ; 
		String baseUrl = "http://google.com";
		
		// 
		
//		System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");
		
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\IEDriverServer.exe");
		
		// we want to test on Chrome Browser
		driver = new InternetExplorerDriver();
		
		driver.get(baseUrl);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
}
