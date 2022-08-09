package com.insurancemanagementsystem;

import java.util.ArrayList;

public class Enterprise extends Account {
	
	public Enterprise() {
		this.setStatus(AuthenticationStatus.FAIL);
		this.setInsurances(new ArrayList<>());
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
	
	public Enterprise(User user) {
		this.setUser(user);
	}
	
	public void addAddress(String address) {
		AddressManager.addAddress(this.getUser(), new BusinessAddress(address));
	}

}
