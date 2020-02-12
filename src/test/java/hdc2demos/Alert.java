package hdc2demos;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Alert {
  @Test(enabled=false)
  public void f() {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	  if(ExpectedConditions.alertIsPresent()!=null)
  {
		  System.out.println("alert are present");
		  org.openqa.selenium.Alert alt=driver.switchTo().alert();
		  System.out.println(alt.getText());
		  alt.accept();
	 }
	  else
	  {
		  System.out.println("no alerts");
	  }
  }
	  @Test
	  public void frame() {
		  WebDriver driver;
		  driver=Driversdemo1.getDriver("CRM");
		  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));	  
		  driver.findElement(By.xpath("//button[text()='Try it']")).click();
		  //driver.switchTo().defaultContent();//to come out from the frame
	  
  }
}
