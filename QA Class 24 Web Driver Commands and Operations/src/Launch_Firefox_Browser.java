import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		
	driver.get("https://www.saucedemo.com/");
		
		driver.navigate().to("https://www.bing.com/");
		
		driver.navigate().to("https://www.google.com");
		
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

}
