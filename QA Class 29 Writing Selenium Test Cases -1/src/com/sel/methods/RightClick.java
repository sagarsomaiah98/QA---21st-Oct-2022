package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/buttons"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement button=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();

	}

}
