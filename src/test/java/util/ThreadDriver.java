package test.java.util;

import org.openqa.selenium.WebDriver;

public class ThreadDriver {
	private static final ThreadLocal<WebDriver> tDriver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return tDriver.get();
	}
	
	public static void setDriver(WebDriver webDriver) {
		tDriver.set(webDriver);
	}
	
	public static void remove() {
		tDriver.get().quit();
		tDriver.remove();
	}
}
