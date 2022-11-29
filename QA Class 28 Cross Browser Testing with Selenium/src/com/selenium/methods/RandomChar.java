package com.selenium.methods;
public class RandomChar {
	
	public static int random() {
		
		
		int id=(int) (Math.random()*10000);
		
		return id;
		
	}

	public static void main(String[] args) {
		
	int unique=	random();
	
	System.out.println(unique);
		
		
		
	
	}

}
