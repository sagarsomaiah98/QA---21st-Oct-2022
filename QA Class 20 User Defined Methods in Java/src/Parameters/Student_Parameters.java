package Parameters;

public class Student_Parameters {
	
	

	
	
	public void Rank(int actualmark) {
		if(actualmark>90)
			System.out.println("EXCELLENT");
		else
			System.out.println(" GOOD");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student_Parameters s= new Student_Parameters();
		s.Rank(60);//g
		s.Rank(100);//e
		s.Rank(30);//g
		s.Rank(99);//e

	}

}
