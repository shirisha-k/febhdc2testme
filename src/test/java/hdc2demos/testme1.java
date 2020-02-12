package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignUp")).click();
		WebElement wd=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		Select sel1=new Select(wd);
		sel1.selectByVisibleText("What is your Pet Name?");
		
	}

}
