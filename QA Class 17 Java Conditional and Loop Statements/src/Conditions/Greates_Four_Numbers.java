package Conditions;

public class Greates_Four_Numbers {

	public static void main(String[] args) {
		int a=50;
	    int b=55;
	    int c=45;
	    int d= 90;
	    
	    if((a>b) &(a>c)&(a>d))
         System.out.println(a+" is greatest");
	    else
	    	if((b>c)&(b>d))
             System.out.println(b+" is greatest");
	    	else if(c>d)
	    		System.out.println(c+" is greatest");
	    	else
	    		System.out.println(d+" is greatest");
	    	
		
		

	}

	}


