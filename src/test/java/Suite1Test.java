package test.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Suite1Test extends BaseTest {
	@Test(groups = { "Suite1" })
	public void test01() {
		System.out.println("test01");
	}
	
	@Test
	public void test02() {
		Assert.assertTrue(false, "Sth is wrong. Please check...");
	}
	

}
