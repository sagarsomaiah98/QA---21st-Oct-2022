package com.selenium.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		Thread.sleep(2000);
		
		s.selectByValue("Yahoo");
		Thread.sleep(3000);
		s.selectByVisibleText("Iphone");
		Thread.sleep(3000);
		s.selectByIndex(0);

	}

}
