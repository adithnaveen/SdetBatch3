package com.fannie.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateScoreStep {

	@Given("^Employee has a credit score$")
	public void employee_has_a_credit_score() throws Throwable {
		System.out.println("Employee has a credit score...");
	}

	@Given("^According to bank standard$")
	public void according_to_bank_standard() throws Throwable {
		System.out.println("According to bank standard...");
	}
	
	
	@When("^cusomter has \"([a-zA-Z]{1,})\" time work$")
	public void cusomter_has_full_time_work(String work) throws Throwable {
		System.out.println("cusomter has "+work+" time work...");
	}

	@When("^In \"([a-zA-Z]{1,})\" office$")
	public void in_govt_office(String office) throws Throwable {
		System.out.println("In "+office+ "office...");
	}

	@Then("^Sanction loan$")
	public void sanction_loan() throws Throwable {
		System.out.println("Sanction loan...");
	}

	@Then("^should be repay in \"([a-zA-Z]{1,})\" years$")
	public void should_be_repay_in_five_years(String term) throws Throwable {
		System.out.println("should be repay in  " +term+" years...");
	}

}
