import org.testng.annotations.Test;

public class Priority_Ex {

	@Test(priority=3)
	public void salary() {
		
		System.out.println("1 salary ");
	}
	@Test(priority=4)
	public void pf() {
		System.out.println("2 PF");
	}
	@Test(priority=1)
	public void branch() {
		System.out.println("4 branch ");
	}
	@Test(priority=1)
	public void agrade() {
		System.out.println("Grade");
	}
}
