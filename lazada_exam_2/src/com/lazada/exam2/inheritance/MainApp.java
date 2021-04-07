package com.lazada.exam2.inheritance;

public class MainApp {

	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		System.out.println("Account type"+consumer.accountype);
		consumer.resetPassword();
		consumer.updateInformation();
		
		Merchant merchant = new Merchant();
		System.out.println("Account type"+merchant.accountype);
		merchant.resetPassword();
		merchant.updateInformation();
		
		Rider rider = new Rider();
		System.out.println("Account type"+rider.accountype);
		rider.resetPassword();
		rider.updateInformation();
	}

}
