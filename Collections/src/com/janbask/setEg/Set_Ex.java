package com.janbask.setEg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	//set doesnt store duplicate values
	
	public static void main(String[] args) {
	
		Set<String> color = new HashSet<String>();
		color.add("RED");
		color.add("WHITE");
		color.add("BLACK");
		color.add("GREEN");
		color.add("BLUE");
		color.add("RED");
		color.add("GREEN");
	 //    color.add("blue");
	   // color.add("black");
		
		
		System.out.println(color.size());
		
		Iterator<String> it = color.iterator();// create pointer and point to set
		
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		

	}

}
