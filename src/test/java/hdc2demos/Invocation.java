package hdc2demos;

import org.testng.annotations.Test;

public class Invocation {
  @Test(priority=1,invocationCount=3,enabled=false)
  public void login() {
	  System.out.println("login");
  }
  @Test(priority=1,enabled=false)
  public void register() {
	  System.out.println("register");
  }
  @Test(priority=1,enabled=false)
  public void logout() {
	  System.out.println("logout");
  }
  @Test(priority=2,dependsOnMethods="m1")
  public void flipkart() {
	  System.out.println("code for flipkart");
  }
  @Test
  public void m1() {
	  int a=10;
	  int b=0;
	  int c=a/b;
	  System.out.println("The final value is:"+c);
  }
  @Test(priority=1)
  public void flipkartreg() {
	  System.out.println("code for flipkart registration");
  }
}
