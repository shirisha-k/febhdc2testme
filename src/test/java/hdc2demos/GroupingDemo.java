package hdc2demos;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test (groups= {"sanity","regression"})
  public void login() {
	  System.out.println("code for login");
  }
  @Test(groups= {"regression"})
  public void register() {
	  System.out.println("code for register");
  }
  @Test(groups= {"sanity"})
  public void logout() {
	  System.out.println("code for logout");
  }
}
