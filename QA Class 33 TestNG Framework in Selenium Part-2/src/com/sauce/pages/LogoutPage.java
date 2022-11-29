package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class LogoutPage extends TestBase {
	
	WebElement menu= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	
	
	public void logout() {
		
		menu.click();
		logout.click();
		
	}

}
