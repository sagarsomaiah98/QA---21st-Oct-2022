package com.sel.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Ex {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		WebElement uname= d.findElement(By.xpath("//input[@id='user-name']"));
		System.out.println(uname);
		uname.sendKeys("standard_user");
		WebElement pwd= d.findElement(By.xpath("//input[@id='password']"));
		System.out.println(pwd);
		pwd.sendKeys("secretsauce");
		Thread.sleep(2000);
		d.quit();

	}

}
