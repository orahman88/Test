package com.pftc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", 
		plugin = {"pretty", "html:target/cucumber", "json:target/json/cucumber.json" },
		tags = {"@SMOKE"}
		//tags = { "@Smoke","@prod" }
		)
public class Runner {

}
