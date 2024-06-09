package test.java.pages;

import org.testng.annotations.Guice;

import com.google.inject.Inject;

import test.java.AppLogger;
import test.java.TestModule;

@Guice(modules = TestModule.class)
public class BasePage {
	@Inject
	protected AppLogger logger;
}
