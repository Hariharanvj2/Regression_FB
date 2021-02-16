package org.stepDefnition;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import BaseClass.Baseclass;
import Pojo.LoginPage;
import Pojo.SingletonClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Scenario extends Baseclass {
	@Given("Launch a chrome browser hit a FB url")
	public void launch_a_chrome_browser_hit_a_FB_url() {
		driver.get("https://www.facebook.com/");
	}

	@When("User enter a Username and Password")
	public void user_enter_a_Username_and_Password(io.cucumber.datatable.DataTable d) throws IOException {
	
		LoginPage Lp = new LoginPage();
		
		Lp.loginApp(d.asList().get(0), d.asList().get(1));
	}

	@When("Click the login button")
	public void click_the_login_button() {
		new LoginPage().getBtn().click();

	}

	@Then("User unable to login and close the browser")
	public void user_unable_to_login_and_close_the_browser() {
		new LoginPage().verifylogin();
	
	}

}
