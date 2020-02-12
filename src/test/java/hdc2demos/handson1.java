package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class handson1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  WebElement s=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	  Actions a=new Actions(driver);
	  a.keyDown(s,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(3000);
	  a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  a.sendKeys(Keys.ENTER).build().perform();
	  driver.quit();
  }
}
