package com.insurancemanagementsystem;

public enum AuthenticationStatus {
	
	SUCCESS(1),
	FAIL(0);
	
	private int status;
	
	AuthenticationStatus(int status){
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}
	

}
