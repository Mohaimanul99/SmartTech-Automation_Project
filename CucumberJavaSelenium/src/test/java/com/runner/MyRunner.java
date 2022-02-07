package com.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "src/test/resources/Features/Login.feature/",    //Location of feature file
		glue = {"StepDefinitions", "com.hooks"},                   //These two are mandatory in CucumberOptions
		plugin = {"json:target/cucumber.json"},
		
		monochrome = true,                         //makes the console more clear and readable
		dryRun = false       //runs the test without opening the browser if add any Step in feature
		
		//tags = "@smoke"
		
		)


public class MyRunner extends AbstractTestNGCucumberTests {
	

}
