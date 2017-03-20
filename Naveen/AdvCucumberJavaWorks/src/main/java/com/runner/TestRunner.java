package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"feature/com/fannie"}, 
		format={"pretty", "html:target/cucumber-html-report"}, 
		glue={"com.fannie.step"}, 
		monochrome= true, 
		tags={"@Sanity"}
		)

public class TestRunner {

}
