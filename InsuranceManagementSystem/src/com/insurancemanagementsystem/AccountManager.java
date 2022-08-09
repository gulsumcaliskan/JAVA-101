package com.insurancemanagementsystem;

import java.util.Date;
import java.util.TreeSet;

public class AccountManager {
	private TreeSet<Account> accounts;
	
	public AccountManager() {
		accounts = new TreeSet<>();
		accounts.add(new Individual(new User("Rose", "Gwen", "rose@hotmail.com", "987654", "Developer", 25, new Date())));
		accounts.add(new Individual(new User("Chloe", "Lily", "chloe@hotmail.com", "321654", "Engineer", 30, new Date())));
	}
	

	public Account login(String email, String password) {
		
		Account account = null;
		
		for(Account acc : accounts) {
			if(acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
				account = acc;
			}
		}
		
		try {
			account.login(email, password);
		}catch(InvalidAuthenticationException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("User does not exist.");
		}
			
		return account;
		
	}
}
