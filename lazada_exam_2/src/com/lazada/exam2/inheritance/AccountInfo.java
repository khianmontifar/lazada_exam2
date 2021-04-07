package com.lazada.exam2.inheritance;

public class AccountInfo {
	private String firstName;
	private String lastName;
	private String accountId;
	private String password;
	private String username;
	
	public void resetPassword() {
		System.out.println("Successfully resetted the password.");
	}
	public void updateInformation() {
		System.out.println("Successfuly updated information.");
	}
	
}
