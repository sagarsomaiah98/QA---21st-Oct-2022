import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Locators {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");

//driver.findElement(By.id("user-name")).sendKeys("standard_user");
//driver.findElement(By.name("user-name")).sendKeys("locked_user");
//driver.findElement(By.cssSelector("#user-name")).sendKeys("user1");

//driver.findElement(By.className("input_error form_input")).sendKeys("test1");


	}

}
