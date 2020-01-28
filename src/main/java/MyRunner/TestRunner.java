package MyRunner;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src\\main\\java\\Features\\login.feature", // the
																		// path
		// of
		// the
		// feature
		// files
		glue = { "stepDefinations" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json", format = {
				"pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, tags = { "~@SmokeTest", "~@RegressionTest", "~@End2End" })
public class TestRunner {
	private TestNGCucumberRunner testNgCucumberRunning;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNgCucumberRunning = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNgCucumberRunning.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNgCucumberRunning.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNgCucumberRunning.finish();
	}

}
