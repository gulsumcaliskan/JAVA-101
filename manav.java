package kasa;

import java.util.Scanner;
public class manav {
	public static void main(String[] args) {
		
		double armut, elma, domates, muz, patlican, toplam;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut ka� kilo: ");
		armut = input.nextDouble();
		
		System.out.print("Elma ka� kilo: ");
		elma = input.nextDouble();
		
		System.out.print("Doamtes ka� kilo: ");
		domates = input.nextDouble();
		
		System.out.print("Muz ka� kilo: ");
		muz = input.nextDouble();
		
		System.out.print("Patl�can ka� kilo: ");
		patlican = input.nextDouble();
		
		double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00, toplamTutar;
		
		toplamTutar = ((armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat));
		System.out.println("Toplam Tutar: " + toplamTutar);
	}

}
