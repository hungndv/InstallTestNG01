package test.java;

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
		for (int i = 0; i < 2; i++) {
			loginPage.login();
			Utils.sleep(1);
		}
	}

	@Test
	public void test02() {
		// This test is to skip
	}
	
	@Test
	public void test03() {
		for (int i = 0; i < 3; i++) {
			ThreadLogger.getLogger().log("Suite1 test03");
			Utils.sleep(1);
		}
	}
}
