package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_LoginTest {

	public void login(String uname, String pwd) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Succesful for the user "+uname);
		}
		catch(Exception e) {
			System.out.println("Login Failed for the user "+uname);
			
		}
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		Validate_LoginTest l = new Validate_LoginTest();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user","secret_sauce");
		l.login("problem_user","secret_sauce");
		l.login("performance_glitch_user","secret_sauce");

	}

}
