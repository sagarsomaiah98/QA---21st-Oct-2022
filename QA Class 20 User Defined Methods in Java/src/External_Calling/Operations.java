package External_Calling;

public class Operations {
	
public void  Division()
	
	{
       int a=10;
		
		int b=20;
		
		int c=a/b;
		
		System.out.println("Division of two numbers "+a+ "  and "+b+" is "+c);					
	}
	
	public void Mutliplication() {
		
		 int t=70;
			
			int u=50;
			
			int k=t*u;
			
			System.out.println("Mutliplication of two numbers "+t+ "  and "+u+" is "+k);
	}
	public static void main(String[] args) {
		
		Operations o = new Operations();
		o.Division();
		o.Mutliplication();
		
	}


}
