/*
import java.util.Scanner;

public class hipotenus {
	public static void main(String[] args) {
		
		int a, b;	
		Scanner input = new Scanner(System.in);
		System.out.print("a kenar uzunlu�u: ");
		a = input.nextInt();
		System.out.print("b kenar uzunlu�u: ");
		b = input.nextInt();
//		c = input.nextInt();
		
		double c = Math.sqrt((a * a) + (b * b));
		
		System.out.print("Hipoten�s uzunlu�u: " + c);
	}
}

*/

import java.util.Scanner;

public class hipotenus {
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("a kenar uzunluk de�eri: ");
		a = input.nextInt();
		System.out.print("b kenar uzunluk de�eri: ");
		b = input.nextInt();
		System.out.print("c kenar uzunluk de�eri: ");
		c = input.nextInt();
		
		int u = (a + b + c) / 2;
		int cevre = (2 * u);
		int alan = u * (u - a) * (u - b) * (u - c);
		
		System.out.println("��genin alan�: " + alan);
	}
}