package com.selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_RadioButton {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='cbqtp']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='radioloadrunner']")).click();

	}

}
