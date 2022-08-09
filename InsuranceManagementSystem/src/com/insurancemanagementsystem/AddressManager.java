package com.insurancemanagementsystem;

public class AddressManager {
	
	public static void addAddress(User user, Address address) {
		user.getAddressList().add(address);
	}
	public static void deleteAddress(User user, Address address) {
		user.getAddressList().remove(address);
	}

}
