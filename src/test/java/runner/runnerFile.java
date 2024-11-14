package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/resources/featureFiles/homePage.feature"},
		glue = {"stepDefinition"},
		plugin = {"pretty","html:target/cucumber-reports/report.html"}	
		
		)

public class runnerFile extends AbstractTestNGCucumberTests{

}
