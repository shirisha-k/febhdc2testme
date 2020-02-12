package hdc2demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelDemo {
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  File myf1=new File("C:\\Users\\H2_9_19_User19\\Desktop\\book1.xlsx");
	  FileInputStream fis=new FileInputStream(myf1);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  int rws=sh.getLastRowNum();
	  for(int i=1;i<=rws;i++)
	  {
		  String u_name=sh.getRow(i).getCell(0).getStringCellValue();
		  String p=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("UserName this time:"+u_name);
		  System.out.println("Password this time:"+p);
//		  String A_txt=driver.findElement(By.xpath("")).getText();
//		  String E_txt="Home";
//		  Assert.assertEquals(A_txt, E_txt);
		  sh.getRow(i).createCell(2).setCellValue("Login Success");
		  FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\H2_9_19_User19\\Desktop\\book1.xlsx"));
		  wb.write(fout);
	  }
	  wb.close();
	  
  }
}
