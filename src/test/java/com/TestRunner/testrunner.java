package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\JavaPrograms\\prank_bank_cucumber\\src\\test\\java\\com\\featurefile\\para_bank_Registration.feature",
				glue="com.stepdefination",
				tags="@smoke",
				plugin= {"pretty",
						"html:Reports/newreport.html",
						"json:Reports/newreport.json",
						"rerun:target/rerun/txt",
				}
				


		)


public class testrunner {
	
	
	

}










