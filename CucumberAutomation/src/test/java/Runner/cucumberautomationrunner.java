package Runner;

import org.junit.runner.RunWith;
import org.junit.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue = {"Stepdefinition"},
		plugin = {"html:target/cucumber-reports/cucumberHTMLReport"},
		dryRun = false
		)

public class cucumberautomationrunner {

	
}
