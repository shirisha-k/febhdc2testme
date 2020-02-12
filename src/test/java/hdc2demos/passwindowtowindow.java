package hdc2demos;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class passwindowtowindow {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String st=driver.getWindowHandle();
	  System.out.println("present window id is:"+st);
	  driver.findElement(By.xpath("//li[@id='homeLoanButton']")).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();
	  String st1=driver.getWindowHandle();
	  System.out.println("child window:"+st1);
//	  driver.quit();
	  Set<String> t_window=driver.getWindowHandles();
	  for(String s:t_window)
	  {
		  driver.switchTo().window(s);
		  String itr=driver.getWindowHandle();
		  System.out.println("the window is:"+itr);
	  }
	  driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();
	  driver.switchTo().window(st);
	  driver.quit();
  }
}
