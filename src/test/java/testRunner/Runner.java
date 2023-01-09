package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/resources/Features"},
		glue="stepDefinition",
		dryRun =false,
		monochrome = false,
        plugin= {"pretty","html:target/home.html"}
		
		)
	
	
	
	


public class Runner {

}
