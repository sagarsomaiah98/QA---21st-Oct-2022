package com.janbask.ArrayExamples;

public class Array_Ex {

	public static void main(String[] args) {
		
	
	//DataType arrayName = new DataType[size of array]	
		
		String[] Stud= new String[15];
		
		Stud[3]="Kevin";
		Stud[4]="Bob";
		Stud[1]="James";
		Stud[0]="Henry";
		Stud[2]="Alice";
		Stud[3]="Bruce";
		Stud[0]="Dean";
		Stud[2]="Sam";
		
		/*
		 * System.out.println(Stud[0]);
		 *  System.out.println(Stud[1]);
		 * System.out.println(Stud[2]); 
		 * System.out.println(Stud[3]);
		 * System.out.println(Stud[4]);
		 */
		
		//System.out.println(Stud[15]);
		
		for(int k=0;k<Stud.length;k++) {
			
			System.out.println(Stud[k]);
		}
		
		

	}

}
