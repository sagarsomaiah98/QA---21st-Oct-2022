package Browser_Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Launch {
	
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 21st Oct 2022\\DRIVER\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	}

}
