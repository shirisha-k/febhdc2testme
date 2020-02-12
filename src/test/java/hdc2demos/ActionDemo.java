package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://www.google.com");
	  WebElement sb=driver.findElement(By.name("q"));
	  //sb.sendKeys("Accenture");
	  Actions a=new Actions(driver);
	  a.keyDown(sb,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  //a.keyDown(sb,Keys.ALT).sendKeys("accenture").keyUp(Keys.ALT).build().perform();
	  //if u want to search same as given string we need to use ALT instead of SHIFT
	  Thread.sleep(3000);
	  a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  a.sendKeys(Keys.ENTER).build().perform();
  }
}
