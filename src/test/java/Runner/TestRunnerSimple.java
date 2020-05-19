package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Ayyappan\\shareTaskEU\\src\\test\\java\\FeatureFiles\\Dashboard.feature",
		glue= {"StepDefinitions"}, //path of step definition file
		plugin= {"pretty"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun= false //to check if the mapping is proper between feature and stepDef file
		)

public class TestRunnerSimple {

}
