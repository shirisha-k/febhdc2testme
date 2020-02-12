package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy {
  @Test
  public void Registration() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		WebElement un=driver.findElement(By.xpath("//input[@id='userName']"));
		un.sendKeys("Lalitha");
		driver.findElement(By.xpath("//span[@id='err']"));
		
  }
}
