package com.janbask.listeg;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_Eg {

	
	//print the below link list values using for loop
	
	public static void main(String[] args) {
       List<String> colors= new LinkedList<String>();
		
		colors.add("Red");//0
		colors.add("black");//1
		colors.add("Green");//2
		colors.add("white");//3
		colors.add("blue");//4
		
		
		colors.add(3, "yellow");
		
		
		System.out.println(colors.size());
		
		System.out.println(colors.get(0));
		System.out.println(colors.get(1));
		System.out.println(colors.get(2));
		System.out.println(colors.get(3));
		System.out.println(colors.get(4));
		System.out.println(colors.get(5));

	}

}
