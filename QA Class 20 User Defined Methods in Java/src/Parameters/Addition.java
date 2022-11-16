package Parameters;

public class Addition {

	
public void  Addition(int a, int b) //arguments/parameters
	
	{
     
		
		int c=a+b;
		
		System.out.println("Addition of two numbers "+a+ "  and "+b+" is "+c);					
	}


public void threeNumberAddition(int j, int k , int l) {
	
	int h=j+k+l;
	
	System.out.println("Addition of three numbers "+j+" and "+k+" and "+l+" is "+h);
}
	
	
	public static void main(String[] args) {
		Addition a = new Addition();
		
		a.Addition(10,20);
		a.Addition(30,15);
		a.Addition(2,4);
		a.Addition(90,20);
		
		a.threeNumberAddition(50, 10, 20);
	}

}
