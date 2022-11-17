package com.janbask.trycatchExample;

public class TRY_CATCH_ARTHEXC {

	public static void main(String[] args) {
		try
		{
		 int a = 30;
         int b = 0;
         int c = a/b;  // cannot divide by zero
         System.out.println ("Result = " + c);
		}
		catch(Exception e1)
		{
			System.out.println("cannot execute try block");
			System.out.println("failed to divide the number");
			e1.printStackTrace();
			
		}
         
         System.out.println("eND OF THE PROGRAM");
         int k=40;
         int m=1;
         int u=k+m;
         
         System.out.println("addition of "+k+" and "+m +" is "+u);
         System.out.println(k/m);
		
		
	}
}
