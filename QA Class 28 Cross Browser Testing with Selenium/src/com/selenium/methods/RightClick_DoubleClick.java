package com.selenium.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		
		Thread.sleep(3000);
		a.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();
	}

}
