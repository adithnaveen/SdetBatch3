package com.fannie.pom;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindLinksTest03 {

	// by doing @BeforeClass the method is loaded only once per 
	// jUnit test case/s
	private static WebDriver driver;
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
		baseUrl="http://fanniemae.com";
		driver.get(baseUrl);
	}
	@Test
	public void test() throws MalformedURLException {
		// impl for get all the links 
		List<WebElement> list = clickableLinks();
		for(WebElement temp : list){
			String href= temp.getAttribute("href");
			System.out.println("URL :" + href +" response -> " + 
					linkStatus(new URL(href)));

		}
	}

	// this method will look for all the elements in the given page 
	// store all "a" and "img" tags and filter which has only 
	// clickable which is with href 
	public static List<WebElement> clickableLinks(){
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		
		List<WebElement> anchorElements = driver.findElements(By.tagName("a"));
		anchorElements.addAll(driver.findElements(By.tagName("img")));
		
		
		for(WebElement temp : anchorElements){
			if(temp.getAttribute("href") !=null){
				linksToClick.add(temp);
			}
		}
		return linksToClick;
	}
	
	public static String linkStatus(URL url){
		// select the code + ALT + SHIFT + Z
		// for try catch block 
		try {
			HttpURLConnection httpConnection = 
					(HttpURLConnection) url.openConnection();
			httpConnection.connect();
			String responseMessage = httpConnection.getResponseMessage();
			httpConnection.disconnect();
			return responseMessage;
		} catch (IOException e) {
			return e.getMessage();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
