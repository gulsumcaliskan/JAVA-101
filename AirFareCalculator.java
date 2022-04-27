import java.util.Scanner;

public class AirFareCalculator {
	public static void main(String[] args){
		
		int distance, age, travel;
		double distanceInitial = 0.10;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance value (in terms of m): ");
		distance = input.nextInt();
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		System.out.println("Choose type of travel. \n1-One Way\n2-Round-Tripper ");
		travel = input.nextInt();
		System.out.println(travel);
		
		double totalPrice = (distance * distanceInitial);
		double ageDiscount, discountTotal, excursionTicket;
		
		if ((distance > 0) && (age > 0) && (travel >=1 && travel <=2)) {
			System.out.println("It is entered a data to the system with successfully.");
		}else {
			System.out.println("Invalid value. Please try again");
		}
		
		if (age < 12) {
			ageDiscount = (totalPrice * 0.50);
			discountTotal = totalPrice - ageDiscount;
			System.out.println("Total Price: " + totalPrice + " Reduced Price: " + discountTotal);
		}else if (age >= 12 && age < 24){
			ageDiscount = (totalPrice * 0.10);
			discountTotal = totalPrice - ageDiscount;
			System.out.println("Total Price: " + totalPrice + " Reduced Price: " + discountTotal);
		}else if (age > 65){
			ageDiscount = (totalPrice * 0.30);
			discountTotal = totalPrice - ageDiscount;
			System.out.println("Total Price: " + totalPrice + " Reduced Price: " + discountTotal);
		}else {
			ageDiscount = (totalPrice * 1);
			discountTotal = totalPrice - ageDiscount;
			System.out.println("Total Price: " + totalPrice + " Reduced Price: " + discountTotal);
		}
		
		if (travel == 2){
			excursionTicket = (discountTotal * 0.20);
			System.out.println("Total Price: " + totalPrice + " Excursion Ticket Price: " + excursionTicket);
		}else {
			System.out.println("It does not have a no discount.");
			System.out.println("Total Price: " + totalPrice);
		}
	}

}
