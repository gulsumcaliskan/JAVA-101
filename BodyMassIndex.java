import java.util.Scanner;
public class BodyMassIndex {
	public static void main(String[] args) {
		
		double height, weight, bodyMass;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your value of height (in terms of m): ");
		height = input.nextDouble();
		System.out.print("Enter your value of weight: ");
		weight = input.nextDouble();
		bodyMass = (weight / (height * height));
		
		System.out.println();
		System.out.print("Your Body Mass Index is: " + bodyMass);
	}
}
