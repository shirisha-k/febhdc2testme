package hdc2demos;

import org.testng.annotations.Test;


public class Parameters {
	@org.testng.annotations.Parameters({"tester","location"})
  @Test
  public void primemembership(String tester, String location) {
	  System.out.println("code for primemembership");
	  System.out.println("it executed by:"+tester);
	  System.out.println("it executed by:"+location);
  }
  @Test
  public void renewal() {
	  System.out.println("code for renewal");
  }
  @org.testng.annotations.Parameters({"tester","location"})
  @Test
  public void termination(String tester, String location) {
	  System.out.println("code for termination");
	  System.out.println("it executed by:"+tester);
	  System.out.println("it executed by:"+location);
  }
}
