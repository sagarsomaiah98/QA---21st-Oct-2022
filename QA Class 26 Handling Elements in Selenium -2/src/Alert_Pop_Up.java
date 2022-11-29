import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_Up {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Alert al =driver.switchTo().alert();
		Thread.sleep(2000);
		String msg= al.getText();
		System.out.println(msg);
	//	al.accept();//ok
		al.dismiss();//cancel
		
	}

}
