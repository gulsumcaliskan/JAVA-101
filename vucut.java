package kitle;

import java.util.Scanner;
public class vucut {
	public static void main(String[] args) {
		
		double boy, kilo, vucutKitle;
		Scanner input = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (m cinsinden) giriniz: ");
		boy = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		kilo = input.nextDouble();
		vucutKitle = (kilo / (boy * boy));
		
		System.out.println("V�cut kitle indeksiniz: " + vucutKitle);
	}
}
