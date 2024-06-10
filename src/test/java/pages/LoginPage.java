package test.java.pages;

import org.openqa.selenium.WebDriver;

import test.java.util.AppLogger;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver, AppLogger logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
	}

	public void login() {
		log("Do login");
	}
}
