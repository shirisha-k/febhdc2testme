package hdc2demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchgoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
		driver1=new ChromeDriver();
		driver1.get("http://www.gmail.com");
		//driver1.navigate().to("");
		//driver1.manage().window().maximize();
		
		
		Dimension d=new Dimension(300,600);
		driver1.manage().window().setSize(d);
		Thread.sleep(3000);
		//driver1.findElement(By.name(""))
		Point p=new Point(300,700);
		driver1.manage().window().setPosition(p);
		String E_title="Gmail";
		String A_title=driver1.getTitle();
		if(A_title.equals(E_title))
		{
			System.out.println("page opened");
		}
		else
		{
			System.out.println("page not opened");
		}
		//driver1.close();
		//driver1.quit();
	}

}
