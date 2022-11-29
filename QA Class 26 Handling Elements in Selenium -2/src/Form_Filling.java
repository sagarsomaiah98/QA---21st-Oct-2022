import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling {

	public int userId() {

		int value = (int) (Math.random() * 10000);
		return value;
	}

	public static void main(String[] args) {

		Form_Filling f = new Form_Filling();
		System.out.println(f.userId());

		
		  String uname="John"+f.userId();
		  
		  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://parabank.parasoft.com/parabank/register.htm");
		  
		  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(
		  "John");
		  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(
		  "Wayne");
		  driver.findElement(By.xpath("//input[@id='customer.address.street']")).
		  sendKeys("24 Baker Street");
		  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys
		  ("NSW");
		  driver.findElement(By.xpath("//input[@id='customer.address.state']")).
		  sendKeys("SYN");
		  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).
		  sendKeys("2145");
		  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(
		  "041236546");
		  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("12345")
		  ; driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(
		  uname);
		  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(
		  "123456");
		  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(
		  "123456");
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
		  
		  
		 

	}

}
