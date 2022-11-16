package Return_Keyword;

public class String_Return_Type {
	
	
	public  String String_function(String name) {
		
		
		
		String place="USA";
		String job="Tester";
		String gender=" male";
		
		String color=" Red";		
		
		color= color+place;// Red+USA->RedUSA
		job= place+gender+name;// USA+male+Henry-> USAmaleHenry
		place= job+color; // USAmaleHenry+RedUSA
		
		place =name+color;//henry+RedUSA
		

		return place;
	
	}

	public static void main(String[] args) {
		
		     
		String_Return_Type s = new String_Return_Type();
		
		String output=s.String_function("Henry");
		System.out.println(output);
		

		
		
		
		

	}

}
