package hdc2demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpicejetMousehover {
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://www.spicejet.com/default.aspx");
	 // Thread.sleep(3000);
	  WebElement e1=driver.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions a=new Actions(driver);
	  a.moveToElement(e1).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
	  
  }
  
  @Test(enabled=false)
  public void rightclick() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://www.google.com");
	 // Thread.sleep(3000);
	  WebElement e2=driver.findElement(By.xpath("//a[text()='Gmail']"));
	  Actions a=new Actions(driver);
	  a.contextClick(e2).build().perform();
	  
  }
  @Test(enabled=false)
  public void doubleclick() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  Thread.sleep(3000);
	  WebElement e3=driver.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
	  Actions a=new Actions(driver);
	  a.doubleClick(e3).build().perform();
	  String txt=e3.getText();
	  System.out.println(txt);
  }
  @Test
  public void dragdrop() throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement src=driver.findElement(By.xpath("//span[@class='rtText']"));
	  WebElement dst=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceholder1_RadGrid1_ClientState']"));
	  Actions a=new Actions(driver);
	  a.dragAndDrop(src,dst).build().perform();
	  //a.clickAndHold(src).release(dst).build().perform();
	  WebElement s1=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceholder1_RadGrid1_ClientState']"));
	  Thread.sleep(3000);
	  String s=s1.getText();
	  String sv="$0";
	  Assert.assertEquals(s,sv);
	  System.out.println("drag and drop success");
  }
  
}
