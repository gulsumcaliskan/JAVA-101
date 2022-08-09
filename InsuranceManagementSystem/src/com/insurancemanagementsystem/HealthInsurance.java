package com.insurancemanagementsystem;

public class HealthInsurance extends Insurance{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.setInsurancePrice(getInsurancePrice() * 2.3);
	}

}
