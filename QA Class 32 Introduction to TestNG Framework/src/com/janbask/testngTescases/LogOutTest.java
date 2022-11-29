package com.janbask.testngTescases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogOutTest {

	@Test
	public void logout() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
		d.quit();
		
	}
	
}
