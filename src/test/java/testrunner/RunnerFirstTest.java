package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
features = "F:\\Test Automation\\BDDPRactice\\features\\firsttest.feature",
glue = "stepdefination"
		
)

public class RunnerFirstTest {}
