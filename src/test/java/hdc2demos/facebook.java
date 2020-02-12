package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver1=new ChromeDriver();
		driver1.get("http://www.facebook.com");
		WebElement wf=driver1.findElement(By.name("firstname"));
		wf.sendKeys("shirisha");
		WebElement wl=driver1.findElement(By.name("lastname"));
		wl.sendKeys("kencha");
		WebElement we=driver1.findElement(By.name("reg_email__"));
		we.sendKeys("9881234567");
		WebElement wp=driver1.findElement(By.name("reg_passwd__"));
		wp.sendKeys("12345");
		WebElement wm=driver1.findElement(By.name("birthday_month"));
		wm.sendKeys("Aug");
		WebElement wd=driver1.findElement(By.name("birthday_day"));
		wd.sendKeys("8");
		WebElement wy=driver1.findElement(By.name("birthday_year"));
		wy.sendKeys("1997");
		driver1.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
		
		driver1.findElement(By.name("websubmit")).click();
		
		
	}

}
