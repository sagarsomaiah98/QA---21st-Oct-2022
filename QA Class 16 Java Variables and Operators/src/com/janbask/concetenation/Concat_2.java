package com.janbask.concetenation;

public class Concat_2 {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		String name="Henry";
		
		System.out.println(a+b);
		System.out.println(b+a);
		System.out.println(a+b+name);
		
		System.out.println(a+name+b);
		System.out.println(name+a+b);// henry1020
		System.out.println(name+(a+b));//henry30

	}

}
