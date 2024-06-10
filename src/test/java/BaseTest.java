package test.java;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import test.java.pages.LoginPage;
import test.java.util.AppLogger;
import test.java.util.SimpleInvokedMethodListener;
import test.java.util.TestModule;
import test.java.util.ThreadDriver;
import test.java.util.ThreadLogger;

@Guice(modules = TestModule.class)
@Listeners(SimpleInvokedMethodListener.class)
public class BaseTest {
	public static ArrayList<String> caseIds = new ArrayList<String>();
	
	protected LoginPage loginPage;
	
	protected void log(String msg) {
		ThreadLogger.getLogger().log(msg);
	}
	
	@BeforeTest
	@Parameters("suiteId")
	public void beforeTest(@Optional String suiteId) {
		// ONLY USE CONSOLE LOG IN @BeforeTest and @AfterTest
		System.out.println(String.format("============beforeTestRun=============%s", suiteId));
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("============afterTestRun=============");
	}
	
	@BeforeMethod
	public void beforeMethod(Method m) {
		AppLogger logger = new AppLogger();
		ThreadLogger.setLogger(logger);

		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("--remote-allow-orgins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.manage().window().maximize();
		ThreadDriver.setDriver(driver);
		
		loginPage = new LoginPage(driver, logger);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
//		ThreadLogger.getLogger().log(String.format("%s-%s ran %s", result.getTestClass().getName(), result.getMethod().getMethodName(), result.isSuccess()));
//		ThreadLogger.getLogger().log("===>afterMethod getAllMsgs<===" + ThreadLogger.getLogger().getAllMsgs());
		String allMsgs = ThreadLogger.getLogger().getAllMsgs();
		log("===>afterMethod END TEST METHOD");
		ThreadLogger.remove();
		ThreadDriver.remove();
	}
}
