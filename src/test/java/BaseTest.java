package test.java;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.inject.Inject;

@Guice(modules = TestModule.class)
@Listeners(SimpleInvokedMethodListener.class)
public class BaseTest {
	public static ArrayList<String> caseIds = new ArrayList<String>();
	
	@Inject
	protected AppLogger logger;
	
	@BeforeTest
	@Parameters("suiteId")
	public void beforeTest(@Optional String suiteId) {
		logger.log(String.format("============beforeTestRun=============%s", suiteId));
	}
	
	@AfterTest
	public void afterTest() {
		logger.log("============afterTestRun=============");
	}
	
	@BeforeMethod
	public void beforeMethod(Method m) {
		logger.reset();
		logger.log("===>beforeMethod getAllMsgs<===" + logger.getAllMsgs());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		logger.log(String.format("%s-%s ran %s", result.getTestClass(), result.getMethod().getMethodName(), result.isSuccess()));
		logger.log("===>afterMethod getAllMsgs<===" + logger.getAllMsgs());
		logger.reset();
	}
}
