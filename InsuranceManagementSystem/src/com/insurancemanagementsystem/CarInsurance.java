package com.insurancemanagementsystem;

public class CarInsurance extends Insurance{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.setInsurancePrice(getInsurancePrice() * 3);
	}

}
