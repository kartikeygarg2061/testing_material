package runner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource//features2"},
					 glue = {"stepdef2"},
					 plugin = {"pretty", "html:target/htmlreports/report.html"},
					 tags = "@set2"
)


public class testrrunner2 extends AbstractTestNGCucumberTests {

}
