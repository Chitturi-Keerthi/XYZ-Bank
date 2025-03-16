package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= {"src/test/java/features/homepage.feature"},
glue= "stepDefinition",monochrome=true,
plugin= {"pretty","html:target/htmlreport.html"})
public class testRunner extends AbstractTestNGCucumberTests{
}