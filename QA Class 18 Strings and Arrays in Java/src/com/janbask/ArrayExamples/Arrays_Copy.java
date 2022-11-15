package com.janbask.ArrayExamples;

import java.util.Arrays;

public class Arrays_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stud= {"mark","steve","jenny","kevin","Joe","Chris"};
		
		String[] college= new String[stud.length];
		
		System.out.println("Length of college array is "+ college.length);
		
		//Write logic to copy the array 
		
		//Hint using for loop

		/*
		 * college[0]=stud[0]; college[1]=stud[1]; System.out.println(college[1]);
		 */
		
		
		
		for(int i=0;i<stud.length;i++) {
			
			//copy student array one by one to college array
			college[i]=stud[i];
			
			
			
		}
		
		for(int i=0;i<college.length;i++) {
			System.out.println(college[i]);
		}
		
		
		

	}

}
