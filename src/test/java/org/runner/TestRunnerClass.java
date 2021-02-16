package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import TestReport.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepDefnition", monochrome = true, dryRun = false, plugin = {
		"json:src/test/resources/Report/fb.json", "rerun:src/test/resources/failed.txt" })
public class TestRunnerClass {
	@AfterClass
	public static void reportGenaration() {
		JvmReport.genarateJvmReport("./src/test/resources/Report/fb.json");
	}
}
