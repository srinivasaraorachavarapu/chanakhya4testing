package Com.AutomationFramework.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "E:\\enag\\Aviva_Project_final\\Feature_file_Manager\\Links_in_Aviva.feature"
		,glue={"E:\\enag\\Aviva_Project_final\\src\\test\\java\\Com\\AutomationFramework\\GherkinImplementation"},
		monochrome=true,
		dryRun = true
		
			)

public class Runner_class {
	
}
