package daire;

import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		
		double r, alan, cevre, a;
		Scanner input = new Scanner(System.in);
		System.out.print("Yar��ap� giriniz: ");
		r = input.nextDouble();
		System.out.print("Merkez a��s� �l��s�n� giriniz: ");
		a = input.nextDouble();
		
		alan = (3.14 * r * r);
		cevre = (2 * 3.14 * r);
		a = ((3.14 * (r * r) * a) / 360);
		System.out.println("Alan: " + alan + " �evre: " + cevre);
		System.out.println("Merkez a��s�n�n �l��s�: " + a);
		
	}
}
