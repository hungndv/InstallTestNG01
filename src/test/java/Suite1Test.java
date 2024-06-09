package test.java;

import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import test.java.pages.LoginPage;

@Guice(modules = TestModule.class)
public class Suite1Test extends BaseTest {
	@Inject
	private LoginPage loginPage;
	
	@Test(groups = { "Suite1" })
	public void test01() {
		loginPage.login();
		Utils.sleep(5);
	}

	@Test
	public void test02() {
		Utils.sleep(5);
		Assert.assertTrue(false, "Sth is wrong. Please check...");
	}

}
