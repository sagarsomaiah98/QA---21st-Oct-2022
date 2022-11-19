package com.janbask.listeg;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Eg {

	public static void main(String[] args) {
		
		List<String> colors= new ArrayList<String>();
		
		colors.add("Red");//0
		colors.add("black");//1
		colors.add("Green");//2
		colors.add("white");//3
		colors.add("blue");//4
		colors.add("Red");//5
		colors.add("brown");
		colors.add("yellow");
		
		System.out.println(colors.size());
		
	//	System.out.println(colors.get(2));
		
		for(int i=0;i<colors.size();i++) {
			
			System.out.println(colors.get(i));
		}
		
	}

}
