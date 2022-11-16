package com.janbask.interfaceExample;

public class HDFC implements CentralBank{

	public static void main(String[] args) {
	HDFC H = new HDFC();
	H.savings();
	H.homeloans();
	H.creditcard();
		
	}

	@Override
	public void savings() {
		System.out.println("HDFC SAVINGS ACCOUNT MIN BALANCE IS 25000$");
	}

	@Override
	public void homeloans() {
		System.out.println("HDFC OFFERS HOME LOANS FOR 4%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC OFFERS CREDIT CARD WITH 100$ FEE");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}



}
