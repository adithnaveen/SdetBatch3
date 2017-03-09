package com.fannie.javascript;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

public class JavaScriptInvoke {


	private WebDriver driver;
	private JavascriptExecutor jsExecutor;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		jsExecutor = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		// driver.quit();
	}
	@Test
	public void test() {
		jsExecutor.executeScript
			("window.location='http://naveenks.com/selenium/RegForm.html'");
		
		WebElement element = (WebElement) 
			jsExecutor.executeScript("return document.getElementById('inputEmail')");
		element.sendKeys("hello@gmail.com");
		
	}

}














