/*
import java.util.Scanner;

public class hipotenus {
	public static void main(String[] args) {
		
		int a, b;	
		Scanner input = new Scanner(System.in);
		System.out.print("a kenar uzunluðu: ");
		a = input.nextInt();
		System.out.print("b kenar uzunluðu: ");
		b = input.nextInt();
//		c = input.nextInt();
		
		double c = Math.sqrt((a * a) + (b * b));
		
		System.out.print("Hipotenüs uzunluðu: " + c);
	}
}

*/

import java.util.Scanner;

public class hipotenus {
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("a kenar uzunluk deðeri: ");
		a = input.nextInt();
		System.out.print("b kenar uzunluk deðeri: ");
		b = input.nextInt();
		System.out.print("c kenar uzunluk deðeri: ");
		c = input.nextInt();
		
		int u = (a + b + c) / 2;
		int cevre = (2 * u);
		int alan = u * (u - a) * (u - b) * (u - c);
		
		System.out.println("Üçgenin alaný: " + alan);
	}
}