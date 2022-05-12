import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		
		int num1, num2, select; 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		
		System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.print("Choose your option: ");
		select = input.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("Addition: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication: " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("Division: " + (num1 / num2));	
				}else {
					System.out.println("Can't divided by 0");
				}
				break;
			default:
				System.out.println("Invalid option. Please try it again!!!");
				break;
		}
		
	}
}

