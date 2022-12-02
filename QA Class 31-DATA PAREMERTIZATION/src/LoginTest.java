import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	

	
	
	
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		  Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 21st Oct 2022\\QA Class 31-DATA PAREMERTIZATION\\src\\TEST_DATA\\SAUCE_LOGIN.xlsx");
		    
		   int rowCount= xls.getRowCount("SAUCE");
		   System.out.println(rowCount);
		   
		   
		  for( int i=2;i<=rowCount;i++) {
			  
		  
		 String uname=  xls.getCellData("SAUCE", "USERNAME", i);
		 String pwd=  xls.getCellData("SAUCE", "PASSWORD", i);
		
		 System.out.println(uname+" | "+pwd);
		    
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//input[@id='login-button']")).click();
		  
		  Thread.sleep(2000); 
		  driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
			 
	}

	}
	
}
