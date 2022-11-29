package com.excel.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 19th Aug 2022\\QA Class 31 Writing Selenium Test Cases -3\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println(rowCount);

	
	 
	  
	  for(int i=2;i<=rowCount;i++) 
	  {
		  String uname=	xls.getCellData("SAUCE", "USERNAME", i);
		  String pwd=xls.getCellData("SAUCE", "PASSWORD", i);
	
		  
		  System.out.println(uname+" "+pwd);
		  
		  
		  
		  System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			d.get("https://www.saucedemo.com/");
			
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			
			d.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='login-button']")).click();
			
			d.quit();
		  
		
		  
	  }
		
		
		
		
	}

}
