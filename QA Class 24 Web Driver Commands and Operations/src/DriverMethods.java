import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
      ChromeDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//  driver.manage().window().minimize();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	String source=	driver.getPageSource();
	System.out.println(source);
	
	//driver.close();
	
	driver.quit();
		
		
	}

}
