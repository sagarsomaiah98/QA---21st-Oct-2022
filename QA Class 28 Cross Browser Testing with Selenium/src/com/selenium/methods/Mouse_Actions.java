package com.selenium.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA-27th May 2022\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement menu=driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
		WebElement submenu=driver.findElement(By.xpath("//span[normalize-space()='Free Deep Learning eBooks']"));
		
		action.moveToElement(menu).build().perform();
		
		Thread.sleep(2000);
		
		submenu.click();
		
		
		
	}

}
