package Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Baseclass;

public class Forget_Password_Page extends Baseclass {

	public Forget_Password_Page() {

		PageFactory.initElements(Baseclass.driver, this);
	}

	@FindBy(id = "identify_email")
	private WebElement mnum;
	@FindBy(id = "did_submit")
	private WebElement search;
	@FindBy(xpath = "//*[@class=\"pam uiBoxRed\"]")
	private WebElement message;

	public WebElement getMessage() {
		return message;
	}

	public void setMessage(WebElement message) {
		this.message = message;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMnum() {
		return mnum;
	}

	public WebElement getsearch() {
		return search;
	}

	public void sendnum(String number) {
		sendText(getMnum(), number);
	}

	public String msg() {
		String text = getText(getMessage());
		return text;
	}
}
