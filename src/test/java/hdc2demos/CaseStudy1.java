package hdc2demos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class CaseStudy1 {
  @Test
  public void Registration() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		WebElement un=driver.findElement(By.xpath("//input[@id='userName']"));
		un.sendKeys("Leena1");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='firstName']")).click();
	WebElement a=	driver.findElement(By.xpath("//span[@id='err']"));
		
		String str=a.getText();
		//driver.findElement(By.xpath("//input[@id='firstName']")).click();
		String s="Available";
		
		Assert.assertEquals(str,s );
		WebElement fn=driver.findElement(By.xpath("//input[@id='firstName']"));
	      fn.sendKeys("Leena1");
		
		
			
			WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
			ln.sendKeys("kencha");
			WebElement p=driver.findElement(By.xpath("//input[@id='password']"));
			p.sendKeys("abcd1234");
			WebElement cp=driver.findElement(By.xpath("//input[@id='pass_confirmation']"));
			cp.sendKeys("abcd1234");
			driver.findElement(By.xpath("//span[text()='Female']")).click();
			WebElement em =driver.findElement(By.xpath("//input[@id='emailAddress']"));
			em.sendKeys("shirisha@gmail.com");
			WebElement mn=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
			mn.sendKeys("9951802374");
			WebElement db=driver.findElement(By.xpath("//input[@id='dob']"));
			db.sendKeys("05/11/1997");
			WebElement ad=driver.findElement(By.xpath("//*[@id=\"address\"]"));
			ad.sendKeys("hyderabad");
			WebElement sq=driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
			Select sel1=new Select(sq);
			sel1.selectByVisibleText("What is your Pet Name?");
			WebElement sa=driver.findElement(By.xpath("//input[@id='answer']"));
			sa.sendKeys("puppy");
			driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
			}
	
  }
 

  

