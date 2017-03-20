package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	
	// this method will be global for the application
	@Before
	public void hoodMethod(){
		System.out.println("^^^^^ Hey You have to connect to DB ^^^^^^^");
	}
	
	
	@Before("@FirstDryRun")
	public void betaTestCases(){
		System.out.println("<<<<<<<<<< Connect to Old Server >>>>>>>>");
	}
	
	@Given("Launch FireFox")
	public void setUp(){
		System.out.println("******Launching FireFox Browser******");
	}
	
	
	
	
	
	@When("^user successfully logs in$")
	public void user_successfully_logs_in(DataTable data) throws Throwable {
		System.out.println("user successfully logs i n>>>>> ");
		
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		
		for(Map<String, String> temp : list){
		
		System.out.print("Login -> " + temp.get("login"));
		System.out.println("Password-> " + temp.get("password"));
		}
	}

	@Then("^show inbox$")
	public void show_inbox() throws Throwable {
		System.out.println("Show inbox>>>> ");
	}

}
