package Return_Keyword;

public class Return_Ex {
	
	public int add() {
		
		int a=200;
		int b=300;
		int c=a+b;
		//System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
	
		Return_Ex r = new Return_Ex();
		int k= r.add();
		
		System.out.println(k);
		
		  if(k%2==0)
		  
		  System.out.println(k+" is even");
		  else 
			  System.out.println(k+"is odd");
		 
	}

}
