package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class LoginPage extends TestBase {
	
	public WebElement uname=driver.findElement(By.xpath("//input[@id='user-name']"));
	public WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
	public WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
	
	public void login(String username, String password) 
	{
		uname.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		
	}
	
	

}
