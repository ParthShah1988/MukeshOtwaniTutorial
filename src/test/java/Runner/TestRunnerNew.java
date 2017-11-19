package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"StepDefination"},
		plugin={"html:target/cucumber-html-report"}
		)
public class TestRunnerNew 
{
	
}
