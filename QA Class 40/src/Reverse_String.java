
public class Reverse_String {

	public static void main(String[] args) {
		
		String value="WELCOME TO JANBASK";
	
		int len=value.length();
		
		
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(value.charAt(i));
		}
		

	}

}
