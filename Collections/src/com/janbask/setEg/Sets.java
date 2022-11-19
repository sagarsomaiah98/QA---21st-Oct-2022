package com.janbask.setEg;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
	
	//set doesnt store duplicate values
	public static void main(String[] args) {
		
		
		Set<String> colors= new HashSet<String>();
		
		colors.add("Red");
		colors.add("black");
		colors.add("Green");
		colors.add("white");
		colors.add("blue");
		colors.add("red");

	//	System.out.println(colors.size());
		
		Iterator<String> it = colors.iterator();
		
		/*System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		*/
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
		
	}

}
