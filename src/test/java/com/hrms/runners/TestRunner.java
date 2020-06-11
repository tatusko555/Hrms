package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",//specify which feature file to run
		glue = "com/hrms/steps",//where we can find implementation code for gherkin steps?
								//we specify just package
		dryRun = false,// if set to true it will quickly scan that all gherkin steps have implementation code
					// if set to true no actual execution will happen
					//change to false to run it
		monochrome = true,//more readable format in console
		strict = true,
		tags = "@HW",
		plugin = {
				"pretty", //prints gherkin steps in console
				"html:target/cucumber-default-report", //creates basic html report in specified location
				"json:target/cucumber.json"
				}
		)
public class TestRunner {

}
