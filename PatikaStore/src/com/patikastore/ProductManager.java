package com.patikastore;

import java.util.List;

public class ProductManager {
	List<Product> products;
	
	public boolean add(Product product) {
		return products.add(product); 
	}
	
	public List<Product> listProductByCategory(String category){
		return products;
	}
	
	public void remove(int id) {
		System.out.println("The product with id " + id + " is deleted.");
	}
	
	public List<Product> filter(int id){
		return products;
		
	}
	
	public List<Product> filter(Brand brand){
		return products;
		
	}
}
