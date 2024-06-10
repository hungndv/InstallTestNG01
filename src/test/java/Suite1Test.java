package test.java;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;

import test.java.pages.LoginPage;
import test.java.util.Helpers;
import test.java.util.TestModule;
import test.java.util.ThreadLogger;

@Guice(modules = TestModule.class)
public class Suite1Test extends BaseTest {
	
	@Test(groups = { "Suite1" })
	public void test01() {
		for (int i = 0; i < 2; i++) {
			loginPage.login();
			Helpers.sleep(1);
		}
	}

	@Test
	public void test02() {
		// This test is to skip
	}
	
	@Test
	public void test03() {
		for (int i = 0; i < 3; i++) {
			log("Suite1 test03");
			Helpers.sleep(1);
		}
	}
}
