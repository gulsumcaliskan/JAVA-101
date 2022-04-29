package taksimetre;

import java.util.Scanner;

public class Taximeter {

public static void main(String[] args) {
		
		double perKm = 2.20;
		double openingPrice = 10;
		double total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance that you will go in terms of meter (m): ");
		int km = input.nextInt();
	
		total = (km * perKm);
		total += openingPrice;
		
		total = (total < 20) ? 20 : total;
	
		System.out.println("Total Price: " + total);
		
	}
	
}
