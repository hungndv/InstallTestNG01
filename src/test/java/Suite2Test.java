package test.java;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Suite2Test extends BaseTest {
  @Test (groups = { "Suite2" })
  public void f() {
	  System.out.println("Hello from suite 2");
  }
}
