package test.java.pages;

import test.java.ThreadLogger;

public class LoginPage extends BasePage{
	public void login() {
		ThreadLogger.getLogger().log("Do login");
	}
}
