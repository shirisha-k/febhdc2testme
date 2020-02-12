package hdc2demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooflinksdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> t_links=driver.findElements(By.tagName("a"));
		int n_links=t_links.size();
		System.out.println(n_links);
		for(int i=0;i<n_links;i++)
		{
			String linknames=t_links.get(i).getText();
			System.out.println(linknames);
		}
		

	}

}
