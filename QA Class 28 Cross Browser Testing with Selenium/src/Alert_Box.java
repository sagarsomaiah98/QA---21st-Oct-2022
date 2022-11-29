import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\OCT_WEEKDAY_BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		Alert al= driver.switchTo().alert();
		Thread.sleep(3000);
		
		
		String alert_msg=al.getText();
		System.out.println(alert_msg);
		//al.accept();
		al.dismiss();
		
	}

}
