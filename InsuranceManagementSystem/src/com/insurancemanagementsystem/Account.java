package com.insurancemanagementsystem;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{
	
	private AuthenticationStatus status;
	private User user;
	private ArrayList<Insurance> insurances;
	
	public final void showUserInfo() {
		System.out.println(user.getName() + " " + user.getSurname() + " " + user.getAge() + " " + user.getJob() + " " + user.getEmail());
	
		for(Address address : this.user.getAddressList()) {
			System.out.println(address.getAddress());
		}
	}
	
	// Getter and Setter
	public AuthenticationStatus getStatus() {
		return status;
	}


	public void setStatus(AuthenticationStatus status) {
		this.status = status;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public ArrayList<Insurance> getInsurances() {
		return insurances;
	}


	public void setInsurances(ArrayList<Insurance> insurances) {
		this.insurances = insurances;
	}


	
	// Login Process
	public void login(String email, String password) throws InvalidAuthenticationException {
		if(email.equals(this.user.getEmail()) && password.equals(this.user.getPassword())) {
			this.status = AuthenticationStatus.SUCCESS;
		}else {
			throw new InvalidAuthenticationException("Email or password is wrong!!");
		}
			
	}
	
	// Add Insurance
	public abstract void addInsurance(Account account, Insurance insurance);

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}
	
	public int compareTo(Account acc) {
		return this.hashCode() - acc.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Account account = (Account) obj;
		return Objects.equals(user, account.user);
		
	}

	
}
