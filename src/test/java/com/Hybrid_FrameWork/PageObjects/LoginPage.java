package com.Hybrid_FrameWork.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "usernameField")
	WebElement username;

	@FindBy(id = "passwordField")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginButton;

	public void enterUsername(String name) {

		username.sendKeys(name);

	}

	public void enterPassword(String pwd) {

		password.sendKeys(pwd);

	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

}
