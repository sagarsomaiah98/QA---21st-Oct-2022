package com.sel.methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement double_button= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(double_button).build().perform();
		
		

	}

}
