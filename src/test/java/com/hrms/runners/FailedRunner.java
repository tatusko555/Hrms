package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failed.txt",
		glue = "com/hrms/steps",//where we can find implementation code for gherkin steps?
								//we specify just package
		monochrome = true,//more readable format in console
		strict = true,
		plugin = {
				"pretty", //prints gherkin steps in console
				//"html:target/cucumber-default-report", //creates basic html report in specified location
				//"json:target/cucumber.json",
				//"rerun:target/failed.txt"
				}
		)

public class FailedRunner {

}
