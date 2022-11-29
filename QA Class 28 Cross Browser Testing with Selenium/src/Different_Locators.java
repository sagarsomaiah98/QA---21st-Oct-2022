import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		Thread.sleep(3000);

		driver.findElement(By.linkText("This is a link")).click();
		
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Performance']")).click();

	}

}
