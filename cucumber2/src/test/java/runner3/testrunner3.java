package runner3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//feature3"},
				glue = {"stepdef_context"},
				plugin = {"pretty", "html:target/htmlreports/report.html"},
				tags = "@set11"
		)




public class testrunner3 extends AbstractTestNGCucumberTests {

}
