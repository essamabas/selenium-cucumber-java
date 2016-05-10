package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumberReport",
		"pretty:target/cucumberReport/cucumber-json-report.json",
		"junit:target/cucumberReport/cucumber-junit.xml"},
		features = "classpath:features/caldb"
)

public class RunCukeTest {
}
