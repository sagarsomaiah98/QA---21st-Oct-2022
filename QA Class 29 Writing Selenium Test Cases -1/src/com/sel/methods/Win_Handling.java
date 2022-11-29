package com.sel.methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Handling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(3000);
	//    driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
	    
	    
	    Set<String>  win =driver.getWindowHandles();
	    System.out.println("TOTAL WINDOWS OPENDED "+win.size());
	    
	    Iterator<String> it =win.iterator();
	   String parent = it.next();
	   String child=it.next();
	   
	   driver.switchTo().window(child);
	   driver.findElement(By.xpath("//span[normalize-space()='Try For Free']")).click();
	   Thread.sleep(3000);
	   
	   win =driver.getWindowHandles();
	   
	   System.out.println("************  After clicking on try for free *************");
	   System.out.println("Total Windows --"+win.size());
	    driver.quit();

	}

}
