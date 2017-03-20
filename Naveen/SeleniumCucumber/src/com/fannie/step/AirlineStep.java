package com.fannie.step;

import org.openqa.selenium.WebDriver;

import com.fannie.pom.FlightPagePOMFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AirlineStep {
	private WebDriver driver;
	private FlightPagePOMFactory factory;

	@Given("^Chrome Browser$")
	public void chrome_Browser() throws Throwable {
		driver = com.fannie.pom.DriverFactory.getDriver("chrome");
		
	}

	@When("^airline pom$")
	public void airline_pom() {
		// you are passing chrome driver got from Driver Factory
		factory = new FlightPagePOMFactory(driver);
		driver.get("http://expedia.com");
	}

	@Given("^click on flights tab$")
	public void click_on_flights_tab() throws Throwable {
		factory.clickFlightTab();
	}

	@Given("^enter \"([^\"]*)\" the src location$")
	public void enter_the_src_location(String arg1) throws Throwable {
		factory.sendFlyingFrom(arg1);
	}

	@Given("^enter \"([^\"]*)\" the dest location$")
	public void enter_the_dest_location(String arg1) throws Throwable {
		factory.sendFlyingTo(arg1);
	}

	@Given("^enter depature date \"([^\"]*)\"$")
	public void enter_depature_date(String arg1) throws Throwable {
		factory.sendDepartingDate(arg1);
	}

	@Given("^enter arrival date \"([^\"]*)\"$")
	public void enter_arrival_date(String arg1) throws Throwable {
		factory.sendReturnDate(arg1);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		factory.clickSearchButton();
	}

	@Then("^show the flight information$")
	public void show_the_flight_information() throws Throwable {
		System.out.println("the job is being processed>>>>>>>>>>>");
	}

}
