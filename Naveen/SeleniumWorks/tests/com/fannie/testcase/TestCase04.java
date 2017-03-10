package com.fannie.testcase;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// to test drop down 
// and multi select 
public class TestCase04 {


	private WebDriver driver;
	private String baseUrl;
	private String baseUrl1;
	private String baseUrl2; 
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium SDET3\\chromedriver.exe");

		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		baseUrl1 ="http://html.com/attributes/select-multiple/";
		baseUrl2 ="http://naveenks.com/selenium/RegForm.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		// driver.quit();
	}

	
	
	
	@Ignore
	@Test
	public void test() {
		driver.get(baseUrl);
		// package-rooms-hp-package -> rooms 
		// package-1-adults-hp-package -> adult 
		// package-1-children-hp-package -> kids 
		
		WebElement element1 = driver.findElement(By.id("package-rooms-hp-package"));
		Select select1 = new Select(element1);
		
		List<WebElement> options= select1.getOptions();
		
		System.out.println("Number of option for element 1 -> " + options.size());
		
		for(int i=0; i<options.size(); i++){
			System.out.println(select1.getOptions().get(i).getText());
		}
		
		
		// select by value 
		// select1.selectByValue("2");
		
		// select by index 
		select1.selectByIndex(2);
		
		
		
		
		
		
	}

	@Ignore 	@Test
	public void multiSelectTest() throws Exception{
		driver.get(baseUrl1);
		
		// //*[@id="wrapper"]/article/section/div[2]/select
		
		Select select = new 
			Select(driver.findElement
					(By.xpath("//*[@id='wrapper']/article/section/div[2]/select")));
		
		select.selectByValue("American");
		select.selectByValue("Greater");
		
		Thread.sleep(3000);
		select.deselectByValue("American");
		
		Thread.sleep(1000);
		select.deselectByValue("Greater");
		Thread.sleep(2000);
		select.selectByIndex(2);
	}
	
	
	@Test
	public void getSubmitButtonValue() throws Exception{
		driver.get(baseUrl2);
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/form/div[13]/div/input[1]"));
		
		String elementText = element.getAttribute("value");
		
		System.out.println("Element Text is : " + elementText);
	}
	
	
	
	
	
}