package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vikas\\eclipse-workspace\\MavenDemoTest\\src\\main\\java\\Features\\background.feature", // the path
																												// of
																												// the
																												// feature
																												// files
		glue = { "stepDefinations" }, plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml" }, // the path of the step definition files
		dryRun = false, monochrome = true, strict = false,tags= {"~@SmokeTest" ,"~@RegressionTest","~@End2End" })
public class TestRunner2 {

}
