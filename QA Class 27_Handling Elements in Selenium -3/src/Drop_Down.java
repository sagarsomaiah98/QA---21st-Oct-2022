import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Select sel = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));

		
		  Thread.sleep(3000); 
		  sel.selectByValue("Database"); 
		  Thread.sleep(3000);
		  sel.selectByVisibleText("Automation Testing");
		  Thread.sleep(3000);
		  sel.selectByIndex(1);
		  
		 

	}

}
