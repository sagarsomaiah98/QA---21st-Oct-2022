package com.janbask.interfaceExample;

public class HDFC implements Central_Bank {

	

	@Override
	public void savings() {
		System.out.println("HDFC has minimum balance of 25000$");
		
	}

	@Override
	public void loan() {
		System.out.println("HDFC loan interest is 4.5%");
		
	}

	

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	
public static void main(String[] args) {
		
		HDFC h = new HDFC();
		h.savings();
		
		h.loan();

		
	}

}
