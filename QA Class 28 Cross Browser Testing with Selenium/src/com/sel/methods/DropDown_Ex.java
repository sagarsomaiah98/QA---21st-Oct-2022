package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Ex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='first']"));
	
		//Select sel= new Select(dropdown);
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
		
		/*
		 * sel.selectByValue("Yahoo"); Thread.sleep(2000); sel.selectByIndex(0);
		 * Thread.sleep(2000); sel.selectByVisibleText("Iphone"); Thread.sleep(2000);
		 */
		
		
		for(int i=0;i<4;i++) {
			
			sel.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		
		driver.quit();
		
		
		
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
