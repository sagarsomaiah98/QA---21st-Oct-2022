package com.janbask.setEg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex1 {

	public static void main(String[] args) {
		
		Set<String> colors= new HashSet<String>();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("BLACK");

		colors.add("GREEN");
		colors.add("WHITE");

		colors.add("BROWN");
	//	colors.add("Red");
	//	colors.add("Black");
		
		System.out.println(colors.size());
		
		Iterator<String> it=colors.iterator();
		
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		


	}

}
