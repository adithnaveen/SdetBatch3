package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@When("^user successfully logs in$")
	public void user_successfully_logs_in(DataTable data) throws Throwable {
		System.out.println("user successfully logs i n>>>>> ");
		
		List<Map<String, String>> list = data.asMaps(String.class, String.class);
		
		System.out.print("Login -> " + list.get(0).get("login"));
		System.out.println("Password-> " + list.get(0).get("password"));
		
		System.out.print("Login -> " + list.get(1).get("login"));
		System.out.println("Password-> " + list.get(1).get("password"));

		System.out.print("Login -> " + list.get(2).get("login"));
		System.out.println("Password-> " + list.get(2).get("password"));
	}

	@Then("^show inbox$")
	public void show_inbox() throws Throwable {
		System.out.println("Show inbox>>>> ");
	}

}
