import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	@Test
	public void method1() {
		
		System.out.println(" CALLING method1");
	}
	@Test
	public void method2() {
		
		System.out.println("CALLING method2");
	}
	
	@BeforeMethod
	public void before() {
		
		System.out.println("********** CALLING BEFORE **************");
	}
	@AfterTest
	public void tear () {
		
		System.out.println("CALLING after test");
	}
	
	@Test
	public void method3() {
		
		System.out.println("CALLING method3");
	}
	
	@AfterMethod
	public void after() {
		
		System.out.println("********** CALLING AFTER **************");
	}
	
	@BeforeTest
	public void intial () {
		
		System.out.println("CALLING before test");
	}

	

}
