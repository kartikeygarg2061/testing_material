package assign_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//assign_features"},
				glue = {"assign_stepdef"},
				plugin = {"pretty", "html:target/htmlreports/report.html"},
				tags = "@set10"
		
		)


public class assignrunner extends AbstractTestNGCucumberTests {

}
