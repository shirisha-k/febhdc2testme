package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class handson3 {
  @Test(dataProvider = "dp")
  public void f(String n, String l, String e, String p) throws InterruptedException {
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	  driver.findElement(By.xpath("//label[text()='Female']")).click();
	  WebElement name=driver.findElement(By.xpath("//input[@id='FirstName']"));
	  name.sendKeys(n);
	  WebElement lname=driver.findElement(By.xpath("//input[@id='LastName']"));
	  lname.sendKeys(l);
	  WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	  email.sendKeys(e);
	  WebElement pass=driver.findElement(By.xpath("//input[@id='Password']"));
	  pass.sendKeys(p);
	  WebElement cp=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	  cp.sendKeys(p);
	  driver.findElement(By.xpath("//input[@id='register-button']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(e);
	  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(p);
	  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	  System.out.println("login success");
	  Thread.sleep(2000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shirisha","kencha", "s@gmail.com","abc123" },
      new Object[] { "Leena sri", "nalluri","l@gmail.com","def456" },
      new Object[] { "Dharani", "ddd","d@gmail.com","ghi789" },
    };
  }
}
