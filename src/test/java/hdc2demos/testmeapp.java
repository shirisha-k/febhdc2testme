package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testmeapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver abc;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		abc=new ChromeDriver();
		abc.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		abc.findElement(By.linkText("SignIn")).click();
		WebElement wc=abc.findElement(By.name("userName"));
		wc.sendKeys("Lalitha");
		WebElement wp=abc.findElement(By.name("password"));
		wp.sendKeys("password123");
		Thread.sleep(5000);
		abc.findElement(By.name("Login")).click();
		

	}

}
