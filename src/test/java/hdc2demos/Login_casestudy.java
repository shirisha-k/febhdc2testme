package hdc2demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Login_casestudy {
	public class ExtentReport {
		WebDriver driver;
	    ExtentHtmlReporter htmlReporter;
	    ExtentReports extent;
	    ExtentTest test;
	    @BeforeTest
	    	public void startReport() {
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport_Srini.html");
	        extent = new ExtentReports();
	        htmlReporter.config().setDocumentTitle("Extent Report Demo by Srini");
	        htmlReporter.config().setReportName("Test Report for Demo");
	        htmlReporter.config().setTheme(Theme.DARK);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	    }
	
	@Test(priority=1,enabled=false)
	  public void testRegistration() throws InterruptedException {
		 test = extent.createTest("TC_01", "Testregistration");
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training1\\Downloads\\Selenium\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
			WebElement un=driver.findElement(By.xpath("//input[@id='userName']"));
			un.sendKeys("Leenanall");
			Thread.sleep(3000);
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
				driver.close();
				}
		
  @Test(priority=2)
  public void testLogin() throws InterruptedException {
	  test = extent.createTest("TC_02", "TestLogin");
	  WebDriver driver;
	  driver=Driversdemo1.getDriver("CRM");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignIn")).click();
		WebElement wc=driver.findElement(By.name("userName"));
		wc.sendKeys("Lalitha");
		WebElement wp=driver.findElement(By.name("password"));
		wp.sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		String str=driver.getTitle();
		String a="Home";
		Assert.assertEquals(str,a);
		Thread.sleep(5000);
		
		
  }
  @Test(priority=3)
  public void testCart() throws InterruptedException
  {
	  test = extent.createTest("TC_03", "TestCart");
	     WebElement all=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
	     Actions ac=new Actions(driver);
	     ac.moveToElement(all).build().perform();
	     WebElement ele=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
	     ele.click();
	     WebElement hp=driver.findElement(By.xpath("//span[text()='Head Phone']"));
	     hp.click();
	     WebElement atc=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
	     atc.click();
	     WebElement c=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
	     c.click();
	     String ex="Shopping Cart";
	     String act=driver.getTitle();
	     Assert.assertEquals(ex,act);
	     //System.out.println("added to the cart successfully ");
  }
  @Test(priority=4,enabled=false)
  public void testPayment() throws InterruptedException
  {
	  test = extent.createTest("TC_04", "TestPayment");
	     
	     
	     WebElement c=driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a"));
	     c.click();
	     
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
  
	

@AfterMethod
public void getResult(ITestResult result) throws IOException {
    if(result.getStatus() == ITestResult.FAILURE) {
        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.PINK));
        
        TakesScreenshot snapshot =   (TakesScreenshot)driver;
        File src = snapshot.getScreenshotAs(OutputType.FILE);
        String Path = System.getProperty("user.dir") +"/test-output/screens/"+result.getName()+".png";
        FileUtils.copyFile(src, new File(Path));
        test.addScreenCaptureFromPath(Path, result.getName());
        test.fail(result.getThrowable());
    }
    else if(result.getStatus() == ITestResult.SUCCESS) {
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.INDIGO));
    }
    else {
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
        test.skip(result.getThrowable());
    }
}
 
@AfterTest
public void tearDown() {
	//to write or update test information to reporter
    extent.flush();
}
}
}