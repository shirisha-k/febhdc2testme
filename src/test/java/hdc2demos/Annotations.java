package hdc2demos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @Test
  public void login() {
	  System.out.println("some 5 lines of code for login");
  }
  @BeforeMethod
  public void launch() {
	  System.out.println("some 3 lines of code for launching the application");
  }
  @Test
  public void register() {
	  System.out.println("some 20 lines of code for register");
  }
  @AfterMethod
  public void closing() {
	  System.out.println("some 15 lines of code for closing");
  }
  @BeforeClass
  public void clearBrowserCache() {
	  System.out.println("some 25 lines of code for closing");
  }
  @AfterClass
  public void deleteCookies() {
	  System.out.println("some 15 lines of code for clear");
  }
  @BeforeTest
  public void BrowserConfiguration() {
	  System.out.println("some  of code for configure");
  }
  @AfterTest
  public void BrowserRollback() {
	  System.out.println("some  of code for rollback");
  }
}
