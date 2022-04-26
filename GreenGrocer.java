package kasa;

import java.util.Scanner;
public class GreenGrocer {
	public static void main(String[] args) {
		
		double pear, apple, tomato, banana, eggplant, total;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of pear: ");
		pear = input.nextDouble();
		
		System.out.print("Enter the weight of apple: ");
		apple = input.nextDouble();
		
		System.out.print("Enter the weight of tomato: ");
		tomato = input.nextDouble();
		
		System.out.print("Enter the weight of banana: ");
		banana = input.nextDouble();
		
		System.out.print("Enter the weight of eggplant: ");
		eggplant = input.nextDouble();
		
		double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00, totalPrice;
		
		totalPrice = ((pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant * eggplantPrice));
		System.out.println();
		System.out.print("Total Price: " + totalPrice);
	}

}
