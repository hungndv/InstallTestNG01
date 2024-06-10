package test.java.util;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;

import test.java.BaseTest;

public class SimpleInvokedMethodListener implements IInvokedMethodListener {
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod() && testResult.getMethod().getMethodName() == "test02" && BaseTest.caseIds.isEmpty()) {
			throw new SkipException(null);
		}
	}
}