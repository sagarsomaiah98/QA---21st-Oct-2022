package com.janbask.interfaceExample;

public class ICICI implements CentralBank {

	public static void main(String[] args) {
		ICICI i= new ICICI();
		i.savings();
		i.homeloans();
		i.creditcard();
		
	}

	@Override
	public void savings() {
		System.out.println("ICICI SAVINGS ACCOUNT MIN BALANCE IS 20000$");
		
	}

	@Override
	public void homeloans() {
		System.out.println("ICICI OFFERS HOME LOANS AT 3.8%");
		
	}

	@Override
	public void creditcard() {
System.out.println("ICICI OFFERS CREDIT CARD WITH 50$ FEE");
		
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
