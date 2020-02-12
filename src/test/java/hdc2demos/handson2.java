package hdc2demos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class handson2 {
  @Test
  public void f() {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm#");
	  WebElement ab=driver.findElement(By.xpath("//span[text()='AboutUs']"));
//	  WebElement oo=driver.findElement(By.xpath("//li[@class='subfirst']"));
//	  Select sel1=new Select(oo);
//	  sel1.selectByVisibleText("Banglore");
	  Actions a=new Actions(driver);
	  a.moveToElement(ab).build().perform();
	  WebElement oo=driver.findElement(By.xpath("//li[@class='subfirst']"));
	  a.moveToElement(oo).build().perform();
	  driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
	  
	  Set<String> t_window=driver.getWindowHandles();
	  for(String s:t_window)
	  {
		  driver.switchTo().window(s);
		  String itr=driver.getWindowHandle();
		  
	  }
	  
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  WebElement str=driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
	  
	  System.out.println(str.getText());
	  driver.quit();
  }
}
