package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "src\\test\\java\\features",
		glue = "steps",
		tags= "@Feature",
		monochrome=true,
		dryRun=false,
		plugin= {	
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"
		}
		)
public class LoginRunner {

}
