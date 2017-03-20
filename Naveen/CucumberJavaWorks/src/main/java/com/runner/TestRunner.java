package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"feature/com/fannie"}, 
		plugin={"pretty", "html:target/cucumber-html-report"}, 
		glue={"com.fannie.step"}, 
		monochrome= true, 
		tags={"@Sanity"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
