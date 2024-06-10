package test.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.java.util.Helpers;
import test.java.util.ThreadLogger;

@Test(groups = { "Suite2" })
public class Suite2Test extends BaseTest {
	
	@Test
	public void test2_1() {
		log("Hello from suite 2 - test 1");
		Helpers.sleep(5);
	}
	
	@Test
	public void test2_2() {
		Assert.assertTrue(false, "Sth is wrong. Please check...");
	}
}
