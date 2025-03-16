package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



public class runnerfile {
	
	@CucumberOptions(
			features="src/test/java/features/Homeandbankmngfile.feature", 
			glue="stepDefinitions",
			plugin= {"pretty",
					"json:target/cucumber-reports/CucumberTestReport.json",
					"html:target/cucumber-reports/CucumberTestReport.html"
			},
			monochrome=true)

			public class TestRunner extends AbstractTestNGCucumberTests {

				
			}

}
