package com.insurancemanagementsystem;

import java.util.ArrayList;

public class Individual extends Account {

	
	public Individual() {
		// TODO Auto-generated constructor stub
		this.setStatus(AuthenticationStatus.FAIL);
		this.setInsurances(new ArrayList<>());
	}

	
	public Individual(User user) {
		// TODO Auto-generated constructor stub
		this.setUser(user);
	}

	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addInsurance(Account account, Insurance insurance) {
		// TODO Auto-generated method stub
		insurance.calculate();
		account.getInsurances().add(insurance);
	}

}
