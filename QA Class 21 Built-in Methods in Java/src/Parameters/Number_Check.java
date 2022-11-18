package Parameters;

public class Number_Check {
	
	
	public void check(int a) {
		
		if(a%2==0)
			System.out.println(a+" is even number");
		else
			System.out.println(a+" is odd number ");
		
		
	}
	

	public static void main(String[] args) {
		
	Number_Check n = new Number_Check();
	n.check(91);
	n.check(100);
	n.check(9);
	n.check(25);
	n.check(49);
		
		
	}

}
