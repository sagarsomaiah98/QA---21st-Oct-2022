

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		

		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	
		
		driver.get("https://www.globalsqa.com/demo-site/"); // navigate to the url
		driver.manage().window().maximize(); // maximize the window

	
         Thread.sleep(3000); // pause the execution for 3 seconds
	
		Actions action = new Actions(driver); 
		WebElement ele = driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/free-ebooks/']"));// Store the web element

		Thread.sleep(3000);
		
		action.moveToElement(ele).build().perform();// perform mouse hover
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Free Deep Learning eBooks')]")).click(); // click on the element

	}

}
