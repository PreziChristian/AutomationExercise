package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "F:\\Test Automation\\BDDPRactice\\src\\test\\resources\\features\\excercise13.feature",
		glue="stepdefination",
		 plugin = {"pretty", "html:target/cucumber-reports.html"},
		  monochrome = true
)

public class RunnerExercise13 {

}
