


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);


		

		WebElement trialaction = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement ele= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Thread.sleep(3000);

		a.doubleClick(trialaction).perform();
		
		a.contextClick(ele).perform();
		
	
		
		
		

	}

}
