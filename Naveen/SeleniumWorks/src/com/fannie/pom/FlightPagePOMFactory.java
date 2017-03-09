package com.fannie.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPagePOMFactory {

	WebDriver driver;
	public FlightPagePOMFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="flight-origin-hp-flight")
	WebElement flyingFrom;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement flyingTo;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departingDate; 
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
	
	@FindBy(xpath="//*[@id='gcw-flights-form-hp-flight']/div[7]/label/button")
	WebElement searchButton;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	public void clickFlightTab(){
		flightTab.click();
	}
	
	public void sendFlyingFrom(String src){
		flyingFrom.click();
		flyingFrom.sendKeys(src);
	}
	
	public void sendFlyingTo(String dest){
		flyingTo.click();
		flyingTo.sendKeys(dest);
	}
	
	public void sendDepartingDate(String date){
		departingDate.click();		departingDate.clear();
		departingDate.sendKeys(date);
	}
	
	public void sendReturnDate(String date){
		returnDate.click();		returnDate.clear();
		returnDate.sendKeys(date);
	}
	
	public void clickSearchButton(){	searchButton.click();	}
	
	
	
	
}
