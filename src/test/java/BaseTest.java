package test.java;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Guice(modules = TestModule.class)
@Listeners(SimpleInvokedMethodListener.class)
public class BaseTest {
	public static ArrayList<String> caseIds = new ArrayList<String>();
	
	@BeforeTest
	@Parameters("suiteId")
	public void beforeTest(@Optional String suiteId) {
		// USE CONSOLE LOG IN @BeforeTest and @AfterTest
		System.out.println(String.format("============beforeTestRun=============%s", suiteId));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("============afterTestRun=============");
	}
	
	@BeforeMethod
	public void beforeMethod(Method m) {
		ThreadLogger.setLogger(new AppLogger());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
//		ThreadLogger.getLogger().log(String.format("%s-%s ran %s", result.getTestClass().getName(), result.getMethod().getMethodName(), result.isSuccess()));
//		ThreadLogger.getLogger().log("===>afterMethod getAllMsgs<===" + ThreadLogger.getLogger().getAllMsgs());
		String allMsgs = ThreadLogger.getLogger().getAllMsgs();
		ThreadLogger.getLogger().log("===>afterMethod END TEST METHOD");
		ThreadLogger.remove();
	}
}
