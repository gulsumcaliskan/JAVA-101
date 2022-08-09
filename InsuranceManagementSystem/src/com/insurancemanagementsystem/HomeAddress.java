package com.insurancemanagementsystem;

public class HomeAddress implements Address{

	private String address;
	
	public HomeAddress(String adress) {
		this.address = adress;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
