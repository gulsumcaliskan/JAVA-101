package com.insurancemanagementsystem;

public class ResidenceInsurance extends Insurance{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.setInsurancePrice(getInsurancePrice() * 1.7);
	}

}
