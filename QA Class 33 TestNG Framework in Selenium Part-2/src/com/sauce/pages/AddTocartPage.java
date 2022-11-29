package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class AddTocartPage extends TestBase{
	
	WebElement addtocart =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	
	WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	
	
	public void addtocart() {
		
		addtocart.click();
		cart.click();
		
	}

}
