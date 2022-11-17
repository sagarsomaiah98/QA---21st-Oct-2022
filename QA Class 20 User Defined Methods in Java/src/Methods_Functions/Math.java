package Methods_Functions;

public class Math {
	
	//accessModifier returnType method/function name	
	
	public void addition()
	
	{
		      int a=10;
		      int b=20;
		      int c=a+b;
		      System.out.println("Addition of two numbers  "+a+" and "+b+" is "+c);	
		
	}
	
	public void subtraction()
	{
		  int k=40;
	      int j=30;
	      int m=k-j;
	      System.out.println("Subtaction of two numbers  "+k+" and "+j+" is "+m);
	
	}
	
	public static void main(String[] args) {
		
      //CLASSNAME OBJECT= NEW CLASSNAME();
		
		Math test= new Math();
		test.addition();
		test.addition();
		test.subtraction();
		
  
  
    
  		
		
		
      
		
		
		
	}

}
