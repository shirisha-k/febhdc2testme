package hdc2demos;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void f() {
	  int a=10;
	  int b=20;
	  int c=10;
	  Assert.assertEquals(a, c);
	  System.out.println("first time");
	  Assert.assertEquals(a, b);
	  System.out.println("second time");
  }
}
