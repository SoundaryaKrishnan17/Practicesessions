package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resource//Feature//HomePage.feature",
                 glue="com.Amazon.stepdefinition",
                 dryRun=false, 
                 plugin={"html:target/html","json:target/reports.json"})
	             

public class Testrunner {
		
	                                                                
}
