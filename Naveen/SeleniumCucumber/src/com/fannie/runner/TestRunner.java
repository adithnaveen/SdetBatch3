package com.fannie.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/com/fannie/feature"}, 
		plugin={"pretty", "html:target/cucumber-html-report"}, 
		glue={"com.fannie.step", "com.fannie.driverloads"}, 
		monochrome= true
		)

public class TestRunner {

}
