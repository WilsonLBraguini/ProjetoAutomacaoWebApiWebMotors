package steps.api;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/api",
		glue ="steps.api",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true
		)
public class RunnerApi {

}