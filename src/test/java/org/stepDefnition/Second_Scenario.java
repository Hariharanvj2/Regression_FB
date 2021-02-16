package org.stepDefnition;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebElement;

import BaseClass.Baseclass;
import Pojo.Forget_Password_Page;
import Pojo.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Second_Scenario extends Baseclass {

	@When("user has to click the forget password link")
	public void user_has_to_click_the_forget_password_link() {
		new LoginPage().getFrg().click();

	}

	@When("user has to enter the Invalid mobnum and click the search button")
	public void user_has_to_enter_the_Invalid_mobnum_and_click_the_search_button(io.cucumber.datatable.DataTable d) {
		Forget_Password_Page forget_Page = new Forget_Password_Page();
		forget_Page.sendnum(d.asList().get(0));
		forget_Page.getsearch().click();
	}

	@Then("Read the error message and Close the browser")
	public void read_the_error_message_and_Close_the_browser() {
		Forget_Password_Page Forget = new Forget_Password_Page();
		Assert.fail();
		System.out.println(Forget.msg());

	}

}
