package com.selenium.methods;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Thread.sleep(3000);
		
		Set<String> windows= driver.getWindowHandles();
		
		Iterator<String> it =windows.iterator();
		System.out.println(windows.size());
		
	 String parent=it.next();
      String child=it.next();
      
      driver.switchTo().window(child);
      Thread.sleep(3000);
      driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
		
		System.out.println("After clicking on learn more");
		windows= driver.getWindowHandles();
		it =windows.iterator();
		System.out.println(windows.size());
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		

	}

}
