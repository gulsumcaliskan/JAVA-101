package com.insurancemanagementsystem;

public class TravelInsurance extends Insurance{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		this.setInsurancePrice(getInsurancePrice() * 1.2);
	}

}
