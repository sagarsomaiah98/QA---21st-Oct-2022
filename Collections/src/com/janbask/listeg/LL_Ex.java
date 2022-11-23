package com.janbask.listeg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL_Ex {

	public static void main(String[] args) {
		List<String> students= new LinkedList<String>();
		students.add("Henry");
		students.add("Mark");
		students.add("James");
		students.add("Wong");
		
		
		System.out.println(students.size());
		
		System.out.println(students.get(0));
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		System.out.println(students.get(3));

	}

}
