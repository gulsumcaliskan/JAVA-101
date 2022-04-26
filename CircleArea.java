package daire;

import java.util.Scanner;

public class CircleArea {
    public static void main(String args[]) {
      double r, area, perimeter, a;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius (r) value: ");
		r = input.nextDouble();
		System.out.print("Enter a central angle (a) value: ");
		a = input.nextDouble();
		
		area = (3.14 * r * r);
		perimeter = (2 * 3.14 * r);
		a = ((3.14 * (r * r) * a) / 360);
		System.out.println("-------------------");
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Central angle: " + a);
    }
}
