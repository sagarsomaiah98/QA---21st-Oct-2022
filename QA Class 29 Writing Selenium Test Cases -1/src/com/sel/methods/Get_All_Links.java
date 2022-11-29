package com.sel.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	/*
	 * System.out.println(links.get(0).getText());
	 * System.out.println(links.get(1).getText());
	 * System.out.println(links.get(2).getText());
	 * System.out.println(links.get(3).getText());
	 */
	
	for(int i=0;i<links.size();i++) {
		
		System.out.println(links.get(i).getText());
	}
	
		driver.quit();

	}

}
