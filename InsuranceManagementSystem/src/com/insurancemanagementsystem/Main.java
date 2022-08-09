package com.insurancemanagementsystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the email: ");
		String email = scan.next();
		System.out.println("Please enter the password: ");
		String password = scan.next();
		
		AccountManager accManager = new AccountManager();
		Account account = accManager.login(email, password);
		System.out.println("Welcome " + account.getUser().getName() + " " + account.getUser().getSurname() + " !!!");
	}

}
