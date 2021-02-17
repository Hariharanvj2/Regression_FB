package org.stepDefnition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.Baseclass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass {
	@Before
	public void beforeExecution() {
		browserfactory("chrome");
	}

	@After
	public void failed(Scenario s) {
		if (s.isFailed()) {
			s.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
	}

	@After
	public void afterExecution() {
		driver.quit();
	}

}
