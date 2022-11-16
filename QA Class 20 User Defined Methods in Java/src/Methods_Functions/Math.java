package Methods_Functions;

public class Math {
	
	//accessModifier returnType method/function name		
	public void  Addition()
	
	{
       int a=10;
		
		int b=20;
		
		int c=a+b;
		
		System.out.println("Addition of two numbers "+a+ "  and "+b+" is "+c);					
	}
	
	public void subtraction() {
		
		 int t=70;
			
			int u=50;
			
			int k=t-u;
			
			System.out.println("Subtraction of two numbers "+t+ "  and "+u+" is "+k);
	}
	
	public static void main(String[] args) {
		
		//to access anything outside the main we need to create a object
		//className object = new ClassName
		
		Math k1= new Math();
		k1.Addition();
		k1.subtraction();
		k1.Addition();
		k1.Addition();
		
		
		
      
		
		
		
	}

}
