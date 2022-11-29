package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogOutTest {

	@Test
	public void logout() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
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
