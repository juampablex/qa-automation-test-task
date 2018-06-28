package testBillie;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(
		features="features",
		glue="stepDefinition"
		)
public class TestBillie extends AbstractTestNGCucumberTests{
	
}