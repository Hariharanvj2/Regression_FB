package Pojo;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;

public class LoginPage extends Baseclass {
	public LoginPage() {

		PageFactory.initElements(Baseclass.driver, this);
	}

	@FindBy(id = "email")
	private WebElement uname;
	@FindBy(id = "pass")
	private WebElement pass;
	@FindBy(xpath = "//*[@name='login']")
	private WebElement btn;
	@FindBy(xpath = "//*[text()='Forgotten password?']")
	private WebElement frg;

	public WebElement getFrg() {
		return frg;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}

	public void loginApp(String Username, String pass) throws IOException {
		sendText(getUname(), Username);
		sendText(getPass(), pass);
	}

	public void verifylogin() {
		assertTrue(!(driver.getTitle().contains("Homepage")));
		System.out.println("Unable to login");
	}

}
