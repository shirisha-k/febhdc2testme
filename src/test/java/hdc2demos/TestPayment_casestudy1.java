package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPayment_casestudy1 {
  @Test
  
	  public void Testpayment() throws InterruptedException {
		  WebDriver driver;
		  driver=Driversdemo1.getDriver("CRM");
		  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		  WebElement s=driver.findElement(By.linkText("SignIn"));
		     s.click();
		     		
		     WebElement u=driver.findElement(By.name("userName"));
		     WebElement p=driver.findElement(By.id("password"));
		     
		     u.sendKeys("lalitha");
		     p.sendKeys("password123");
		     
		     Thread.sleep(2000);
		     WebElement w=driver.findElement(By.name("Login"));
		     w.click();
		     WebElement all=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
		     Actions ac=new Actions(driver);
		     ac.moveToElement(all).build().perform();
		     WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
		     ele.click();
		     WebElement hp=driver.findElement(By.xpath("//span[text()='Head Phone']"));
		     hp.click();
		     WebElement atc=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		     atc.click();
		     
		     WebElement c=driver.findElement(By.xpath("//a[@style='color:green']"));
		     c.click();
		     
		     WebElement ct=driver.findElement(By.xpath("//a[@href='checkout.htm']"));
		     ct.click();
		     WebElement ptp=driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input"));
		     ptp.click();
		     Thread.sleep(3000);
		     WebElement bnk=driver.findElement(By.xpath("//label[text()='Andhra Bank']"));
		     bnk.click();
		     Thread.sleep(3000);
		     WebElement cnt=driver.findElement(By.xpath("//a[@id='btn']"));
		     cnt.click();
		     WebElement un=driver.findElement(By.xpath("//input[@type='text']"));
		     un.sendKeys("123456");
		    		 
		    WebElement psw=driver.findElement(By.xpath("//input[@type='password']"));
		    psw.sendKeys("Pass@456");
		    
		    String e="Payment Gateway";
		     String a=driver.getTitle();
		     Assert.assertEquals(e,a);
		     System.out.println("success payment");
		      //Payment GatewayThread.sleep(3000);
		    WebElement lgn=driver.findElement(By.xpath("//input[@value='LOGIN']"));
		    lgn.click();
		    Thread.sleep(3000);
		    WebElement trans=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input"));
		    trans.sendKeys("Trans@456");
		    WebElement pynw=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input"));
		    pynw.click();
		     
		    String ex="Order Details";
		    String act=driver.getTitle();
		    Assert.assertEquals(ex,act);
		    System.out.println("success purchase");
  }
}
