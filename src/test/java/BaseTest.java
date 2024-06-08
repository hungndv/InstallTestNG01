package test.java;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	@BeforeTest
	@Parameters("suiteId")
	public void beforeTest(@Optional String suiteId) {
		System.out.println(String.format("============beforeTestRun=============%s", suiteId));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("============afterTestRun=============");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println(String.format("%s-%s ran %s", result.getTestClass(), result.getMethod().getMethodName(), result.isSuccess()));
	}
}
