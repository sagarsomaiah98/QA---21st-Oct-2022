package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public void intialization() throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\sauce\\config\\config.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String bname =prop.getProperty("BROWSER");
		String url=prop.getProperty("URL");
		
	   int wait=	Integer.parseInt(prop.getProperty("TIMEOUT"));
		
		System.out.println(bname);
		
		switch(bname) {
		
		case "CHROME":
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		
		case "EDGE":
			System.setProperty("webdriver.edge.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("INVALID BROWSER");
			break;
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}

}
