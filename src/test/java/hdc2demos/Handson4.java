package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Handson4 {
  @Test
  public void f() {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("https://www.naukri.com/");
	  WebElement txt=driver.findElement(By.xpath("//h3[@class='noBorder_large_title']"));
	  String str=txt.getText();
	  System.out.println(str);
  }
}
