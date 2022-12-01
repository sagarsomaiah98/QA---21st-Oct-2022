package com.sel.methods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling  {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.siliconfilter.com/category/reviews/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		/*
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollBy(0,100)"); Thread.sleep(3000);
		 */
		
		js.executeScript("window.scrollTo(6000,2000)");
		
		

	}

}
