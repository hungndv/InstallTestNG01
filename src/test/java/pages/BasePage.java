package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Guice;

import test.java.util.AppLogger;
import test.java.util.TestModule;
import test.java.util.ThreadLogger;

@Guice(modules = TestModule.class)
public class BasePage {
	private AppLogger logger;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver, AppLogger logger) {
		this.driver = driver;
		this.logger = logger;
	}
	
	protected void log(String msg) {
		logger.log(msg);
	}
}
