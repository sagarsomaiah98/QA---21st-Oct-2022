import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
	
		//shortcut to import all the packages- ctrl+shift+O
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		
	
		driver.findElement(By.linkText("Privacy")).click();
	
		
		
		Set<String> wind= driver.getWindowHandles();
		
		Iterator<String> it=wind.iterator();
		
		System.out.println(wind.size());
		String win1 =it.next();
		String win2 =it.next();
		
		System.out.println(win1);

		System.out.println(win2);
		
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
		System.out.println("************* AFER CLICKING ON LEARN MORE");
		
Set<String> win= driver.getWindowHandles();
		
		Iterator<String> it1=win.iterator();
		
		System.out.println(win.size());
		String P =it1.next();
		String C =it1.next();
		String T=it1.next();
		
		System.out.println(P);

		System.out.println(C);
		System.out.println(T);
	}

}
