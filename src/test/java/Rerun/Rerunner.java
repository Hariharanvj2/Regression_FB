package Rerun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import TestReport.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/resources/failed.txt", glue = "org.stepDefnition", monochrome = true, dryRun = false, plugin = {
		"json:src/test/resources/Report/fb.json" })
public class Rerunner {

}