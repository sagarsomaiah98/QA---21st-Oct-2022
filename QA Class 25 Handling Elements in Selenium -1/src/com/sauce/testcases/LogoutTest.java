package com.sauce.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogoutTest {
	
	public void logout() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
	LogoutTest lo= new LogoutTest();
	lo.logout();

	}

}
