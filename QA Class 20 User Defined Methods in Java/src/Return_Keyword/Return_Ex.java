package Return_Keyword;

public class Return_Ex {
	
	
	//local variables - variables defined inside method/function, 
	//local variables cannot be accessed outside the function
	public int add(int a, int b) {
		
		
		int c=a+b;
		
		
		System.out.println("addition of two numbers is "+c);
		
		
		return c;
		
		
	}
	

	public static void main(String[] args) {
		
		
		Return_Ex r = new Return_Ex();
		
		int value= r.add(9, 5);//
		System.out.println("value -->"+value);
		
		
		
		if(value%2==0)
			System.out.println("its even number");
		else
			
			System.out.println("its odd number");
		

	}

}
