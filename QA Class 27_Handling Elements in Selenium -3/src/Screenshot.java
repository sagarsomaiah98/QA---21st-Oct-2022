import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		TakesScreenshot sc= ((TakesScreenshot)driver);
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("TEST\\login.png");
		FileUtils.copyFile(src, dest);
		System.out.println("done");
		driver.close();
		
		
		
	}

}
