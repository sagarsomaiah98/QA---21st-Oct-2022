package com.janbask.testngTescases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
	//	Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		d.quit();
	}

	
}
