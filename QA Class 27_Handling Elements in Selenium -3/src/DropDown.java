import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select sel= new Select(driver.findElement(By.xpath("//select[@id='first']")));
		
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("Yahoo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Bing");
		
		//https://demo.automationtesting.in/Register.html
		
	}

}
