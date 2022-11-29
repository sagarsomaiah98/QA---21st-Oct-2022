package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
	
		
		driver.get("https://www.globalsqa.com/demo-site/"); // navigate to the url
		driver.manage().window().maximize(); // maximize the window
		
		WebElement main =driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(main).build().perform();
		
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();

	}

}
