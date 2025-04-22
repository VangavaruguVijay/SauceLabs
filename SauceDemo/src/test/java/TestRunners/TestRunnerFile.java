package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber",glue="SauceDemo.stepDefinitions",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestRunnerFile extends AbstractTestNGCucumberTests{

	
	
}
