package com.lazada.exam2.polymorphism;

public class MainBank {

	public static void main(String[] args) {
		Bank b;  
		b=new BPI();  
		System.out.println("BPI Rate of Interest: "+b.getRateOfInterest());  
		b=new BDO();  
		System.out.println("BDO Rate of Interest: "+b.getRateOfInterest()); 

	}

}
