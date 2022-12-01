package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// https://www.globalsqa.com/demo-site/
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		
		
		
		Actions act = new Actions(driver);
		
		WebElement menu=driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		
		act.moveToElement(menu).build().perform();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']")).click();

	}

}
