package com.janbask.testngTescases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogOutTest {

	@Test
	public void logout() throws InterruptedException {
		
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		d.get("https://www.saucedemo.com/");
		
		//Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		//Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		//Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
		d.quit();
		
	}
	
}
