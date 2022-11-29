package com.selenium.methods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		
		Set<String> colors= new HashSet<String>();
		colors.add("black");
		colors.add("white");
		colors.add("green");
		colors.add("yellow");
		colors.add("blue");
		
		System.out.println(colors.size());
	    
		Iterator<String> it= colors.iterator();
		/*
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
