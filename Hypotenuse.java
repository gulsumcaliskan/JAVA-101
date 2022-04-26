/*
import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		
		int a, b;	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a side lenght value: ");
		a = input.nextInt();
		System.out.print("Enter a side lenght value: ");
		b = input.nextInt();
//		c = input.nextInt();
		
		double c = Math.sqrt((a * a) + (b * b));
		
		System.out.print("The length of Hypotenuse: " + c);
	}
}

*/

import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a side lenght value: ");
		a = input.nextInt();
		System.out.print("Enter b side lenght value: ");
		b = input.nextInt();
		System.out.print("Enter c side lenght value: ");
		c = input.nextInt();
		
		int u = (a + b + c) / 2;
		int perimeter = (2 * u);
		int area = u * (u - a) * (u - b) * (u - c);
		
		System.out.println();
		System.out.println("Area of Triangle: " + area);
	}
}
