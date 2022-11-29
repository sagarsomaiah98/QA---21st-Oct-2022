package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class LoginPage extends TestBase{
	
	
	
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	
	
	public void login(String uname, String pwd) 
	{
	
		
	username.sendKeys(uname);
	password.sendKeys(pwd);
	login.click();
		
		
	}
	

}
